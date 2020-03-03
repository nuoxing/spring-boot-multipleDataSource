package com.work.dao.base;

import com.work.domain.TbPictureInfoData;
import com.work.domain.TbPictureInfoDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPictureInfoDataMapper {
    long countByExample(TbPictureInfoDataExample example);

    int deleteByExample(TbPictureInfoDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbPictureInfoData record);

    int insertSelective(TbPictureInfoData record);

    List<TbPictureInfoData> selectByExample(TbPictureInfoDataExample example);

    TbPictureInfoData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbPictureInfoData record, @Param("example") TbPictureInfoDataExample example);

    int updateByExample(@Param("record") TbPictureInfoData record, @Param("example") TbPictureInfoDataExample example);

    int updateByPrimaryKeySelective(TbPictureInfoData record);

    int updateByPrimaryKey(TbPictureInfoData record);
}