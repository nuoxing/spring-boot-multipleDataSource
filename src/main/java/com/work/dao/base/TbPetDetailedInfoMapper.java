package com.work.dao.base;

import com.work.domain.TbPetDetailedInfo;
import com.work.domain.TbPetDetailedInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPetDetailedInfoMapper {
    long countByExample(TbPetDetailedInfoExample example);

    int deleteByExample(TbPetDetailedInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbPetDetailedInfo record);

    int insertSelective(TbPetDetailedInfo record);

    List<TbPetDetailedInfo> selectByExample(TbPetDetailedInfoExample example);

    TbPetDetailedInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbPetDetailedInfo record, @Param("example") TbPetDetailedInfoExample example);

    int updateByExample(@Param("record") TbPetDetailedInfo record, @Param("example") TbPetDetailedInfoExample example);

    int updateByPrimaryKeySelective(TbPetDetailedInfo record);

    int updateByPrimaryKey(TbPetDetailedInfo record);
}