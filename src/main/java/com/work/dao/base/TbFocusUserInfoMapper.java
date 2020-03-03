package com.work.dao.base;

import com.work.domain.TbFocusUserInfo;
import com.work.domain.TbFocusUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFocusUserInfoMapper {
    long countByExample(TbFocusUserInfoExample example);

    int deleteByExample(TbFocusUserInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbFocusUserInfo record);

    int insertSelective(TbFocusUserInfo record);

    List<TbFocusUserInfo> selectByExample(TbFocusUserInfoExample example);

    TbFocusUserInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbFocusUserInfo record, @Param("example") TbFocusUserInfoExample example);

    int updateByExample(@Param("record") TbFocusUserInfo record, @Param("example") TbFocusUserInfoExample example);

    int updateByPrimaryKeySelective(TbFocusUserInfo record);

    int updateByPrimaryKey(TbFocusUserInfo record);
}