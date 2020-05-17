package com.galaxy.tax.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.galaxy.tax.dao.PrivilegeDao;
import com.galaxy.tax.entity.Privilege;
import com.galaxy.tax.service.PrivilegeService;
import org.springframework.stereotype.Service;

@Service("privilegeService")
public class PrivilegeServiceImpl extends ServiceImpl<PrivilegeDao, Privilege> implements PrivilegeService {
}
