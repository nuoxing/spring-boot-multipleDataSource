package com.work.petring.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.work.dao.ExtendTbPublishCommentInfoDataMapper;
import com.work.dao.base.TbPublishCommentInfoDataMapper;
import com.work.domain.TbPublishCommentInfoData;

/**
 * 宠圈动态的评论信息
 * @author suwenyu
 *
 */
@Service("tbPublishCommentInfoDataService")
public class TbPublishCommentInfoDataService {

	@Autowired
	private ExtendTbPublishCommentInfoDataMapper extendTbPublishCommentInfoDataMapper;
	
	@Autowired
	private TbPublishCommentInfoDataMapper tbPublishCommentInfoDataMapper;
	
	public List<Map<String,Object>> getCommentPageData(Integer pageNum,String id,String time){
		int pageSize = 100;
		Page page = PageHelper.startPage(pageNum, pageSize, true);
		List<Map<String, Object>> lists = extendTbPublishCommentInfoDataMapper.getPageData(time, id);
		return lists;
	}
	
	/**
	 * 保存用户评论动态或者回复动态的信息
	 * @param dynamicId 被评论的动态信息
	 * @param sendUserId 当前评论的用户id
	 * @param replyedUserId 被回复的用户id
	 * @param msgType 信息类型 1是评论信息 2是回复信息
	 * @param content
	 * @return
	 */
	@Transactional(transactionManager="dataSourceTransactionManager",propagation=Propagation.REQUIRED)
	public int insert(String dynamicId,String sendUserId,String replyedUserId,String content){
		TbPublishCommentInfoData vo = new TbPublishCommentInfoData();
		vo.setId(UUID.randomUUID().toString());
		vo.setSenduserid(sendUserId);
		vo.setDynamictid(dynamicId);
		vo.setReplyeduserid(replyedUserId);
		vo.setContent(content);
		vo.setStatus("1");
		vo.setCreatetime(new Date());
		int num = tbPublishCommentInfoDataMapper.insert(vo);
		return num;
	}
	
	
	/**
	 * 
	 * 描述:更新评论信息的状态 为0 <br>
	 * 
	 * @param commentId
	 * @return 
	 * @see
	 */
	@Transactional(transactionManager="dataSourceTransactionManager",propagation=Propagation.REQUIRED)
	public int updateStateById(String commentId){
	    TbPublishCommentInfoData vo = new TbPublishCommentInfoData();
	    vo.setId(commentId);
	    vo.setStatus("0");
	    int num = tbPublishCommentInfoDataMapper.updateByPrimaryKeySelective(vo);
	    return num;
	}
	
}
