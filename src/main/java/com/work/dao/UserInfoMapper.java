package com.work.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {

	
	Map<String,String> getUserInfo(@Param("userid")String userId);
}
