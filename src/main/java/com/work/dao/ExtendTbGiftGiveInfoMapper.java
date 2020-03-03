package com.work.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ExtendTbGiftGiveInfoMapper {
	
	List<Map<String,Object>> getGiveGift(@Param("userId")String userId,@Param("type")String type,@Param("endtime")String endtime);

}
