package com.work.dao.base;

import com.work.domain.TbSysPermission;
import com.work.domain.TbSysPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysPermissionMapper {
    long countByExample(TbSysPermissionExample example);

    int deleteByExample(TbSysPermissionExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbSysPermission record);

    int insertSelective(TbSysPermission record);

    List<TbSysPermission> selectByExample(TbSysPermissionExample example);

    TbSysPermission selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbSysPermission record, @Param("example") TbSysPermissionExample example);

    int updateByExample(@Param("record") TbSysPermission record, @Param("example") TbSysPermissionExample example);

    int updateByPrimaryKeySelective(TbSysPermission record);

    int updateByPrimaryKey(TbSysPermission record);
}