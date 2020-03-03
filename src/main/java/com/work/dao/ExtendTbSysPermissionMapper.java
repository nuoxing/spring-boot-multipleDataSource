package com.work.dao;

import java.util.List;

import com.work.dao.base.TbSysPermissionMapper;
import com.work.domain.TbSysPermission;

public interface ExtendTbSysPermissionMapper extends TbSysPermissionMapper{

	List<TbSysPermission> getByUserId(String id);

}
