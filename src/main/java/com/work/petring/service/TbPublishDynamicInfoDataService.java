package com.work.petring.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.work.dao.ExtendTbPublishDynamicInfoDataMapper;
import com.work.dao.base.TbPublishDynamicInfoDataMapper;
import com.work.domain.TbPublishDynamicInfoData;
import com.work.service.UserCacheService;

/**
 * 宠圈service
 * @author suwenyu
 *
 */
@Service("tbPublishDynamicInfoDataService")
public class TbPublishDynamicInfoDataService {

	
	@Autowired
	private ExtendTbPublishDynamicInfoDataMapper extendTbPublishDynamicInfoDataMapper;
	
	@Autowired
	private TbPublishDynamicInfoDataMapper tbPublishDynamicInfoDataMapper;
	
	@Autowired
	private UserCacheService userCacheService;
	
	/**
	 * 分页获取宠圈数据
	 * @param pageNum 获取的页数 
	 * @param time 取第一页时的最大创建时间，目的时分页获取数据
	 * @return
	 */
	public List<Map<String,String>> getDynamicPageData(Integer pageNum,String time){
		int pageSize = 10;
		Page page = PageHelper.startPage(pageNum, pageSize, true);
		List<Map<String,String>> lists = extendTbPublishDynamicInfoDataMapper.getPageData(time);
		PageInfo<Map<String,String>> pageInfo = new PageInfo<Map<String,String>>(lists);
		System.out.println("总数="+pageInfo.getTotal());
		return lists;
	}
	
	
	/**
	 * 未登录用户 根据地区获取20条数据 如果附近没有数据 扩大区域
	 * @param longitude
	 * @param latitude
	 * @return
	 */
	public List<Map<String,Object>> getDynamicPageDataInNotLogin(BigDecimal longitude,BigDecimal latitude){
		int pageSize = 20;
		Page page = PageHelper.startPage(1, pageSize, true);
		int range = 3;
		//首先在附近取，如果不够20条扩大 第一次扩大10度 第二次20度 第三次所有
		List<Map<String,Object>> lists = extendTbPublishDynamicInfoDataMapper.getDynaminPageDataInNotLogin(longitude, latitude,range);
		if (lists.size()<20){//数据不够
			range = 8;
			lists = extendTbPublishDynamicInfoDataMapper.getDynaminPageDataInNotLogin(longitude, latitude,range);
		}
		if (lists.size()<20){
			range = 15;
			lists = extendTbPublishDynamicInfoDataMapper.getDynaminPageDataInNotLogin(longitude, latitude,range);
		}
		if (lists.size()<20){
			range = 40;
			lists = extendTbPublishDynamicInfoDataMapper.getDynaminPageDataInNotLogin(longitude, latitude,range);
		}
		List<Map<String,Object>> resLists = new ArrayList<Map<String,Object>>();
		//根据用户id获取相应的用户名称，用户头像等等
		for(Map<String,Object> map : lists){
			//在spring的缓存中获取用户名称与用户头像的访问路径等等
			Map<String,String> userInfo = userCacheService.getUserInfo((String)map.get("userid"));
			map.put("PublishPerson", userInfo.get("nickname"));
			map.put("PersonImg", ".jpg");
			map.put("PersonID",userInfo.get("id"));
			resLists.add(map);
		}
		return resLists;
	}
	
	
	
	
	
	
	/**
	 * 已经登陆的用户 同一分钟内发的动态先显示已经关注的用户的信息 不在一分钟内发送只能先发的先显示
	 * @param pageNum
	 * @param userId
	 * @param dynamicTime
	 * @return
	 */
	public List<Map<String,Object>> getDynamicPageDataInLogin(Integer pageNum,String userId,String dynamicTime,String self){
		int pageSize = 10;
		Page page = PageHelper.startPage(pageNum, pageSize, true);
		List<Map<String,Object>> lists = extendTbPublishDynamicInfoDataMapper.getDynaminPageDataInLogin(userId, dynamicTime ,self);
		return lists;
	}
	
	/**
	 * 保存用户的动态信息
	 * @return
	 */
	@Transactional(transactionManager="dataSourceTransactionManager",propagation=Propagation.REQUIRED)
	public int insert(String userid,String content,String uuid,BigDecimal longitude,BigDecimal latitude,String dom){
		
		TbPublishDynamicInfoData vo = new TbPublishDynamicInfoData();
		vo.setId(uuid);
		vo.setUserid(userid);
		vo.setCreatetime(new Date());
		vo.setContent(content);
		vo.setDom(dom);
		vo.setLatitude(latitude);
		vo.setLongitude(longitude);
		vo.setStatus("1");
		int num = tbPublishDynamicInfoDataMapper.insert(vo);
		return num;
	}
	
	
	/**
	 * 逻辑删除数据
	 * @return
	 */
	@Transactional(transactionManager="dataSourceTransactionManager",propagation=Propagation.REQUIRED)
	public int delete(String id){
		TbPublishDynamicInfoData vo = new TbPublishDynamicInfoData();
		vo.setId(id);
		vo.setUpdatetime(new Date());
		vo.setStatus("0");
		int num = tbPublishDynamicInfoDataMapper.updateByPrimaryKeySelective(vo);
		return num;
	}
	
}
