package com.work.dao.base;

import com.work.domain.TbPublishPraiseInfoData;
import com.work.domain.TbPublishPraiseInfoDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPublishPraiseInfoDataMapper {
    long countByExample(TbPublishPraiseInfoDataExample example);

    int deleteByExample(TbPublishPraiseInfoDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbPublishPraiseInfoData record);

    int insertSelective(TbPublishPraiseInfoData record);

    List<TbPublishPraiseInfoData> selectByExample(TbPublishPraiseInfoDataExample example);

    TbPublishPraiseInfoData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbPublishPraiseInfoData record, @Param("example") TbPublishPraiseInfoDataExample example);

    int updateByExample(@Param("record") TbPublishPraiseInfoData record, @Param("example") TbPublishPraiseInfoDataExample example);

    int updateByPrimaryKeySelective(TbPublishPraiseInfoData record);

    int updateByPrimaryKey(TbPublishPraiseInfoData record);
}