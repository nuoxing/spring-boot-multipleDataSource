package com.work.dao.base;

import com.work.domain.TbPetUser;
import com.work.domain.TbPetUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPetUserMapper {
    long countByExample(TbPetUserExample example);

    int deleteByExample(TbPetUserExample example);

    int deleteByPrimaryKey(String OPENID);

    int insert(TbPetUser record);

    int insertSelective(TbPetUser record);

    List<TbPetUser> selectByExample(TbPetUserExample example);

    TbPetUser selectByPrimaryKey(String OPENID);

    int updateByExampleSelective(@Param("record") TbPetUser record, @Param("example") TbPetUserExample example);

    int updateByExample(@Param("record") TbPetUser record, @Param("example") TbPetUserExample example);

    int updateByPrimaryKeySelective(TbPetUser record);

    int updateByPrimaryKey(TbPetUser record);
}