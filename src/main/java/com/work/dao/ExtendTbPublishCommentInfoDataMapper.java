package com.work.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.work.dao.base.TbPublishCommentInfoDataMapper;

public interface ExtendTbPublishCommentInfoDataMapper {

	
	List<Map<String,Object>> getPageData(@Param("time")String time,@Param("id")String id);
}
