package com.work.dao.base;

import com.work.domain.TbDicGiftType;
import com.work.domain.TbDicGiftTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDicGiftTypeMapper {
    long countByExample(TbDicGiftTypeExample example);

    int deleteByExample(TbDicGiftTypeExample example);

    int deleteByPrimaryKey(String code);

    int insert(TbDicGiftType record);

    int insertSelective(TbDicGiftType record);

    List<TbDicGiftType> selectByExample(TbDicGiftTypeExample example);

    TbDicGiftType selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") TbDicGiftType record, @Param("example") TbDicGiftTypeExample example);

    int updateByExample(@Param("record") TbDicGiftType record, @Param("example") TbDicGiftTypeExample example);

    int updateByPrimaryKeySelective(TbDicGiftType record);

    int updateByPrimaryKey(TbDicGiftType record);
}