package com.work.dao.base;

import com.work.domain.TbGiftGiveInfo;
import com.work.domain.TbGiftGiveInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGiftGiveInfoMapper {
    long countByExample(TbGiftGiveInfoExample example);

    int deleteByExample(TbGiftGiveInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbGiftGiveInfo record);

    int insertSelective(TbGiftGiveInfo record);

    List<TbGiftGiveInfo> selectByExample(TbGiftGiveInfoExample example);

    TbGiftGiveInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbGiftGiveInfo record, @Param("example") TbGiftGiveInfoExample example);

    int updateByExample(@Param("record") TbGiftGiveInfo record, @Param("example") TbGiftGiveInfoExample example);

    int updateByPrimaryKeySelective(TbGiftGiveInfo record);

    int updateByPrimaryKey(TbGiftGiveInfo record);
}