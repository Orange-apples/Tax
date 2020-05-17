package com.galaxy.tax.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.galaxy.tax.entity.RolePrivilege;
import com.galaxy.tax.dao.RolePrivilegeDao;
import com.galaxy.tax.service.RolePrivilegeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TaxRolePrivilege)表服务实现类
 *
 * @author makejava
 * @since 2020-05-16 11:37:39
 */
@Service("rolePrivilegeService")
public class RolePrivilegeServiceImpl extends ServiceImpl<RolePrivilegeDao,RolePrivilege> implements RolePrivilegeService {

}