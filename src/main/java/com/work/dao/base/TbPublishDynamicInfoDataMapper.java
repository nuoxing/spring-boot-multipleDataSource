package com.work.dao.base;

import com.work.domain.TbPublishDynamicInfoData;
import com.work.domain.TbPublishDynamicInfoDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPublishDynamicInfoDataMapper {
    long countByExample(TbPublishDynamicInfoDataExample example);

    int deleteByExample(TbPublishDynamicInfoDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbPublishDynamicInfoData record);

    int insertSelective(TbPublishDynamicInfoData record);

    List<TbPublishDynamicInfoData> selectByExample(TbPublishDynamicInfoDataExample example);

    TbPublishDynamicInfoData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbPublishDynamicInfoData record, @Param("example") TbPublishDynamicInfoDataExample example);

    int updateByExample(@Param("record") TbPublishDynamicInfoData record, @Param("example") TbPublishDynamicInfoDataExample example);

    int updateByPrimaryKeySelective(TbPublishDynamicInfoData record);

    int updateByPrimaryKey(TbPublishDynamicInfoData record);
}