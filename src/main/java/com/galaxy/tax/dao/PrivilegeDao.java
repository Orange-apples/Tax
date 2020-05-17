package com.galaxy.tax.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.galaxy.tax.entity.Privilege;
import org.apache.ibatis.annotations.CacheNamespace;

@CacheNamespace(blocking = true)

public interface PrivilegeDao extends BaseMapper<Privilege> {
}
