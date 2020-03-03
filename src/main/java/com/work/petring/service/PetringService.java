package com.work.petring.service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.service.TbPictureInfoDataService;

@Service("petringService")
public class PetringService {

	
	@Autowired
	private TbPublishCommentInfoDataService tbPublishCommentInfoDataService;
	
	@Autowired
	private TbPublishDynamicInfoDataService tbPublishDynamicInfoDataService;
	
	@Autowired
	private TbPublishPraiseInfoDataService tbPublishPraiseInfoDataService;
	
	   @Autowired
	private TbPictureInfoDataService tbPictureInfoDataService;

	
	/**
	 * 函数 暂时没有用到
	 * @param pageNum
	 * @param dynamicTime
	 * @return
	 */
	public List<Map<String, Object>> getPublishPageData(Integer pageNum,String dynamicTime,String userId){
		if (pageNum == null || pageNum.intValue()==0){
			pageNum = 1;
		}
		List<Map<String,Object>> listPage = new ArrayList<Map<String,Object>>();
		//获取动态列表信息
		List<Map<String, String>> dynamicPageData = tbPublishDynamicInfoDataService.getDynamicPageData(pageNum, dynamicTime);
		if(dynamicPageData.size()>0 && StringUtils.isEmpty(dynamicTime)){
			dynamicTime = dynamicPageData.get(0).get("createtime");
		}
		//遍历数据 分别获取点赞与评论信息
		for (Map<String,String> map1 : dynamicPageData){
			Map<String,Object> resMap = new HashMap<String,Object>();
			map1.put("dynamicTime", dynamicTime);
			resMap.put("dynamic", map1);
			
			//获取点赞信息
			List<Map<String, String>> praiseInfo = getPraiseInfo(pageNum, map1.get("id"));
			resMap.put("praise", praiseInfo);
			
			//获取评论信息
			List<Map<String, Object>> commentInfo = getCommentInfo(pageNum, map1.get("id"),userId);
			resMap.put("comment", commentInfo);
			listPage.add(resMap);
		}
		
		return listPage;
	}
	

    /**
     * 描述:未登录用户获取信息 根据地区就近原则获取20条数据
     * @param longitude 经度
     * @param latitude 纬度
     * @return
     */
	public List<Map<String, Object>> getPublishPageDataInNotLogin(BigDecimal longitude,BigDecimal latitude){
		if (longitude.intValue()== -1){
			//到用户表获取用户的注册时的经纬度 目前写死
			longitude = new BigDecimal(20);
			latitude = new BigDecimal(140);
		}
		List<Map<String, Object>> lists = tbPublishDynamicInfoDataService.getDynamicPageDataInNotLogin(longitude, latitude);
		List<Map<String,Object>> listPage = getPublshInfo(lists, null,1,"");
	    return listPage;
	}
	
	
	/**
     * 
     * 描述:已经登录用户获取信息  先获取关注的用户动态信息 <br>
     * 
     * @return 
     * @see
     */
    public List<Map<String, Object>> getPublishPageDataInLogin(Integer pageNum,String userId,String dynamicTime,String self){
    	List<Map<String, Object>> lists = tbPublishDynamicInfoDataService.getDynamicPageDataInLogin(pageNum, userId, dynamicTime, self);
    	if(lists.size()>0 && StringUtils.isEmpty(dynamicTime)){
			dynamicTime = (String)lists.get(0).get("createtime");
		}
    	List<Map<String,Object>> listPage = getPublshInfo(lists, dynamicTime,pageNum,userId);
    	return listPage; 
    }
	
	/**
	 * 处理动态数据 并获取点赞 评论数据
	 * @param lists
	 * @param dynamicTime
	 * @param pageNum
	 * @return
	 */
    private List<Map<String,Object>> getPublshInfo(List<Map<String, Object>> lists,String dynamicTime,Integer pageNum,String userId){
    	List<Map<String,Object>> listPage = new ArrayList<Map<String,Object>>();
    	int num = 0;
    	for (Map<String,Object> map1 : lists){
    		Map<String,Object> resMap = new HashMap<String,Object>();
    		resMap.put("ListNum", (pageNum-1)*10+num);
    		num++;
    		resMap.put("dynamicTime", dynamicTime);
    		resMap.put("delright", false);
			resMap.put("ListID", map1.get("id"));
			resMap.put("PersonImg", map1.get("picture"));
			resMap.put("PersonID", map1.get("openid"));
			resMap.put("dom", map1.get("dom"));
			resMap.put("PublishPerson", map1.get("nickname"));
			resMap.put("Contents", map1.get("content"));
			resMap.put("Like", false);//true 是已经点赞
			List<String> imageList = tbPictureInfoDataService.getPicPathByRelativeId((String)map1.get("id"));
			resMap.put("ImageList", imageList);
			resMap.put("createtime", map1.get("createtime"));
			if (map1.get("focuse")!=null && "yes".equals(map1.get("focuse"))){//该信息对应的用户已被关注了
				resMap.put("focusebtn", false);//false是不显示关注按钮了
			}else{
				resMap.put("focusebtn", true);//true是显示按钮
			}
			
			SimpleDateFormat formate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			if (map1.get("createtime")!=null){
				try {
					int n;
					Date parse = formate.parse((String)map1.get("createtime"));
					Date now = new Date();
					Long time = now.getTime() - parse.getTime();//得到毫秒数
					if (time < 1000 * 60 * 60){//1小时内
						n = time.intValue() / (1000 * 60);
						n = n==0 ? 1 : n;
						resMap.put("PublishTime", (n) + "分钟前");
					}else if (time < 1000 * 60 * 60 * 24){//小于1天
					    n = time.intValue() / (1000 * 60 * 60);
						resMap.put("PublishTime", (n)+"小时前");
					}else {
						  n = time.intValue() / (1000 * 60 * 60 * 24);
						  resMap.put("PublishTime", (n)+"天前");
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}else{
				resMap.put("PublishTime", "");
			}
			
			
			//获取点赞信息
			List<Map<String, String>> praiseInfo = getPraiseInfo(pageNum, (String)map1.get("id"));
			List<String> likeList = new ArrayList<String>();
			for (Map<String,String> likemap : praiseInfo){
				likeList.add(likemap.get("nickname"));
				if (userId.equals(likemap.get("userid"))){//已经点赞过，不能再显示点赞按钮
				    resMap.put("Like", true);
				}else{
				    resMap.put("Like", false);
				}
			}
			resMap.put("LikeList", likeList);
			
			//获取评论信息
			List<Map<String, Object>> commentInfo = getCommentInfo(pageNum, (String)map1.get("id"),userId);
			resMap.put("Comments", commentInfo);
			listPage.add(resMap);
    		
    	}
    	return listPage;
    }
    
    
	/**
	 * 获取评论信息并处理返回
	 * @param pageNum
	 * @param id
	 * @param 
	 * @return
	 */
	private List<Map<String,Object>> getCommentInfo(Integer pageNum,String id,String userId){
	    String time = "";
		List<Map<String, Object>> lists = tbPublishCommentInfoDataService.getCommentPageData(pageNum, id, null);
		if(lists.size()>0){
			time = (String)lists.get(0).get("createtime");
		}
		List<Map<String,Object>> resList = new ArrayList<Map<String,Object>>();
		for (Map<String,Object> map : lists){
			Map<String,Object> resMap = new HashMap<String,Object>();
			if (map.get("replyeduserid") != null){//2是回复信息,其他是评论信息
				resMap.put("ToPersonName",  map.get("replyuser"));
			}
			//是否本人发出的评论 是 就 可以删除
			if (userId.equals(map.get("senduserid"))){
				resMap.put("DelBtn", false);
				resMap.put("PersonName", map.get("senduser"));
			}else{
				//resMap.put("DelBtn", false);
				resMap.put("PersonName", map.get("senduser"));
			}
			resMap.put("Comment", map.get("content"));
			resMap.put("PersonID", map.get("senduserid"));
			resMap.put("commentTime", time);
			resMap.put("CommentID", map.get("id"));
		    resList.add(resMap);		
		}
		return resList;
	}
	
	
	/**
	 * 得到点赞信息
	 * @param pageNum
	 * @param id
	 * @param time
	 * @return
	 */
	private List<Map<String,String>> getPraiseInfo(Integer pageNum,String id){
	    String time = "";
		List<Map<String, String>> lists = tbPublishPraiseInfoDataService.getPraisePageData(pageNum, id, null);
		if(lists.size()>0){
			time = lists.get(0).get("createtime");
		}
		List<Map<String,String>> resList = new ArrayList<Map<String,String>>();
		for (Map<String,String> map : lists){
			map.put("praiseTime", time);
		    resList.add(map);		
		}
		return resList;
	}
}
