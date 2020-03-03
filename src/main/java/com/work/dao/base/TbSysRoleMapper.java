package com.work.dao.base;

import com.work.domain.TbSysRole;
import com.work.domain.TbSysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysRoleMapper {
    long countByExample(TbSysRoleExample example);

    int deleteByExample(TbSysRoleExample example);

    int deleteByPrimaryKey(String ID);

    int insert(TbSysRole record);

    int insertSelective(TbSysRole record);

    List<TbSysRole> selectByExample(TbSysRoleExample example);

    TbSysRole selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") TbSysRole record, @Param("example") TbSysRoleExample example);

    int updateByExample(@Param("record") TbSysRole record, @Param("example") TbSysRoleExample example);

    int updateByPrimaryKeySelective(TbSysRole record);

    int updateByPrimaryKey(TbSysRole record);
}