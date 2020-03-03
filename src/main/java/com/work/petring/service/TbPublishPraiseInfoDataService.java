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
import com.work.dao.ExtendTbPublishPraiseInfoDataMapper;
import com.work.dao.base.TbPublishPraiseInfoDataMapper;
import com.work.domain.TbPublishPraiseInfoData;
import com.work.domain.TbPublishPraiseInfoDataExample;


/**
 * 宠圈点赞功能service
 * @author suwenyu
 *
 */
@Service("tbPublishPraiseInfoDataService")
public class TbPublishPraiseInfoDataService {

	
	@Autowired
	private ExtendTbPublishPraiseInfoDataMapper extendTbPublishPraiseInfoDataMapper;
	

	@Autowired
	private TbPublishPraiseInfoDataMapper tbPublishPraiseInfoDataMapper;
	
	public List<Map<String,String>> getPraisePageData(Integer pageNum,String id,String time){
		int pageSize = 100;
		Page page = PageHelper.startPage(pageNum, pageSize, true);
		List<Map<String, String>> lists = extendTbPublishPraiseInfoDataMapper.getPageData(time, id);
		return lists;
	}
	
	
	/**
	 * 点赞信息保存
	 * @param dynamicId 被点赞的信息id
	 * @param userId 当前点赞的用户id
	 * @return
	 */
	@Transactional(transactionManager="dataSourceTransactionManager",propagation=Propagation.REQUIRED)
	public int insert(String dynamicId,String userId){
		TbPublishPraiseInfoData vo = new TbPublishPraiseInfoData();
		vo.setId(UUID.randomUUID().toString());
		vo.setUserid(userId);
		vo.setCreatetime(new Date());
		vo.setStatus("1");
		vo.setDynamictid(dynamicId);
		int num = tbPublishPraiseInfoDataMapper.insert(vo);
		return num;
	}
	
	
	/**
	 * 删除点赞
	 * @param dynamicId
	 * @param userId
	 * @return
	 */
	@Transactional(transactionManager="dataSourceTransactionManager",propagation=Propagation.REQUIRED)
	public int delete(String dynamicId,String userId){
		TbPublishPraiseInfoDataExample example = new TbPublishPraiseInfoDataExample();
		example.createCriteria().andDynamictidEqualTo(dynamicId).andUseridEqualTo(userId);
		int num = tbPublishPraiseInfoDataMapper.deleteByExample(example);
		return num;
	}
}
