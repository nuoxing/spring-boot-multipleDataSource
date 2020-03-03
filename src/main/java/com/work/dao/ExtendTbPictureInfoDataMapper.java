package com.work.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ExtendTbPictureInfoDataMapper{

	
	List<String> getPicPathByRelativeId(@Param("relativeId")String relativeId);
	
}
