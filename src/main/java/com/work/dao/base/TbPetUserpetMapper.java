package com.work.dao.base;

import com.work.domain.TbPetUserpet;
import com.work.domain.TbPetUserpetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPetUserpetMapper {
    long countByExample(TbPetUserpetExample example);

    int deleteByExample(TbPetUserpetExample example);

    int deleteByPrimaryKey(String ID);

    int insert(TbPetUserpet record);

    int insertSelective(TbPetUserpet record);

    List<TbPetUserpet> selectByExample(TbPetUserpetExample example);

    TbPetUserpet selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") TbPetUserpet record, @Param("example") TbPetUserpetExample example);

    int updateByExample(@Param("record") TbPetUserpet record, @Param("example") TbPetUserpetExample example);

    int updateByPrimaryKeySelective(TbPetUserpet record);

    int updateByPrimaryKey(TbPetUserpet record);
}