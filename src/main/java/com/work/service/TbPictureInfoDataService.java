package com.work.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.work.dao.ExtendTbPictureInfoDataMapper;
import com.work.dao.base.TbPictureInfoDataMapper;
import com.work.domain.TbPictureInfoData;
import com.work.domain.TbPictureInfoDataExample;

@Service
public class TbPictureInfoDataService {

	
	
	@Value("${downurlconfig}")
	private String downurlconfig;
	
	@Autowired
	private ExtendTbPictureInfoDataMapper extendTbPictureInfoDataMapper;
	
	@Autowired
	private TbPictureInfoDataMapper tbPictureInfoDataMapper;
	
	public List<String> getPicPathByRelativeId(String relativeId){
		return extendTbPictureInfoDataMapper.getPicPathByRelativeId(relativeId);
	}
	
	/**
	 * 保存图片的基本信息
	 * @param relativeId
	 * @param picType
	 * @param filePath
	 * @return
	 */
	@Transactional(transactionManager="dataSourceTransactionManager",propagation=Propagation.REQUIRED)
	public int save(String relativeId,String picType,String filePath,int size){
		TbPictureInfoData vo = new TbPictureInfoData();
		vo.setId(UUID.randomUUID().toString());
		vo.setPath(filePath);
		vo.setPictype(picType);
		vo.setStatus("1");
		vo.setCompletepath(downurlconfig+filePath);
		vo.setCreatetime(new Date());
		vo.setPicsize(size);
		vo.setRelativeid(relativeId);
		int num = tbPictureInfoDataMapper.insert(vo);
		return num;
	}
	
	/**
	 * 根据关联id获取对象集合
	 * @param relativeId
	 * @return
	 */
	public List<TbPictureInfoData> getPicByRelativeId(String relativeId){
		TbPictureInfoDataExample example = new TbPictureInfoDataExample();
		example.createCriteria().andRelativeidEqualTo(relativeId);
		return tbPictureInfoDataMapper.selectByExample(example);
	}
	
	/**
	 * 删除图片的基本信息
	 * @param relativeId
	 * @param picType
	 * @param filePath
	 * @return
	 */
	@Transactional(transactionManager="dataSourceTransactionManager",propagation=Propagation.REQUIRED)
	public int delete(String picId){
		int num = tbPictureInfoDataMapper.deleteByPrimaryKey(picId);
		return num;
	}

	/**
	 * 根据主键获取对象
	 * @param picId
	 */
	public  TbPictureInfoData getInfoByid(String picId) {
		 return tbPictureInfoDataMapper.selectByPrimaryKey(picId);
	}
}
