package com.galaxy.tax.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.galaxy.tax.entity.Role;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TaxRole)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-16 11:37:39
 */
public interface RoleDao extends BaseMapper<Role> {

}