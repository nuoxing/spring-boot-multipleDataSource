package com.work.dao.base;

import com.work.domain.TbPublishCommentInfoData;
import com.work.domain.TbPublishCommentInfoDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPublishCommentInfoDataMapper {
    long countByExample(TbPublishCommentInfoDataExample example);

    int deleteByExample(TbPublishCommentInfoDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbPublishCommentInfoData record);

    int insertSelective(TbPublishCommentInfoData record);

    List<TbPublishCommentInfoData> selectByExample(TbPublishCommentInfoDataExample example);

    TbPublishCommentInfoData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbPublishCommentInfoData record, @Param("example") TbPublishCommentInfoDataExample example);

    int updateByExample(@Param("record") TbPublishCommentInfoData record, @Param("example") TbPublishCommentInfoDataExample example);

    int updateByPrimaryKeySelective(TbPublishCommentInfoData record);

    int updateByPrimaryKey(TbPublishCommentInfoData record);
}