package com.galaxy.tax.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
@Service("taxRoleService")
public class RoleServiceImpl extends ServiceImpl<RoleDao,Role> implements RoleService  {

}