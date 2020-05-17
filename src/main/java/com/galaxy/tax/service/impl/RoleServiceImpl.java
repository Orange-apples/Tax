package com.galaxy.tax.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.galaxy.tax.component.ConstantNum;
import com.galaxy.tax.entity.Role;
import com.galaxy.tax.dao.RoleDao;
import com.galaxy.tax.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TaxRole)表服务实现类
 *
 * @author makejava
 * @since 2020-05-16 11:37:39
 */
@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements RoleService {
    @Resource
    RoleDao roleDao;

    @Override
    public Page<Role> queryAllByPage(Role role,Integer pages) {
        return roleDao.selectPage(new Page<Role>(pages, ConstantNum.PAGESIZE),new QueryWrapper<Role>()
        .like("name",role.getName())
        );
    }
}