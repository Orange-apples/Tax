package com.galaxy.tax.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.galaxy.tax.entity.RolePrivilege;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TaxRolePrivilege)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-16 11:37:39
 */
@CacheNamespace(blocking = true)

public interface RolePrivilegeDao extends BaseMapper<RolePrivilege> {

}