package com.work.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ExtendTbGiftInfoMapper {

	
	List<Map<String, Object>> getGiftPageData(@Param("gifttype") String giftType);
   
}