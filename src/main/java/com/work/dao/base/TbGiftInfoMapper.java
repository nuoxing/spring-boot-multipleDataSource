package com.work.dao.base;

import com.work.domain.TbGiftInfo;
import com.work.domain.TbGiftInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGiftInfoMapper {
    long countByExample(TbGiftInfoExample example);

    int deleteByExample(TbGiftInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbGiftInfo record);

    int insertSelective(TbGiftInfo record);

    List<TbGiftInfo> selectByExample(TbGiftInfoExample example);

    TbGiftInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbGiftInfo record, @Param("example") TbGiftInfoExample example);

    int updateByExample(@Param("record") TbGiftInfo record, @Param("example") TbGiftInfoExample example);

    int updateByPrimaryKeySelective(TbGiftInfo record);

    int updateByPrimaryKey(TbGiftInfo record);
}