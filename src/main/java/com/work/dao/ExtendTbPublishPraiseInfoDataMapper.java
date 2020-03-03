package com.work.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;


public interface ExtendTbPublishPraiseInfoDataMapper{

	
	List<Map<String,String>> getPageData(@Param("time")String time,@Param("id")String id);
}
