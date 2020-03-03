package com.work.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;


public interface ExtendTbPublishDynamicInfoDataMapper {

	
	List<Map<String,String>> getPageData(@Param("time")String time);
	
	List<Map<String,Object>> getDynaminPageDataInLogin(@Param("userId")String userId,@Param("time")String dynamicTime,@Param("self")String self);
	
	List<Map<String,Object>> getDynaminPageDataInNotLogin(@Param("longitude")BigDecimal longitude,@Param("latitude")BigDecimal latitude,@Param("range")int range);
}
