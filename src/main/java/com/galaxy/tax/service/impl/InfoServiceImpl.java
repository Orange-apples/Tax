package com.galaxy.tax.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.galaxy.tax.component.ConstantNum;
import com.galaxy.tax.entity.Account;
import com.galaxy.tax.entity.Info;
import com.galaxy.tax.dao.InfoDao;
import com.galaxy.tax.service.InfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Info)表服务实现类
 *
 * @author makejava
 * @since 2020-05-25 15:32:51
 */
@Service("infoService")
public class InfoServiceImpl extends ServiceImpl<InfoDao,Info> implements InfoService {
    @Resource
    InfoDao infoDao;
    @Override
    public Page<Info> queryAll(Integer pages, Info info) {
        return infoDao.selectPage(new Page<Info>(pages, ConstantNum.PAGESIZE),new QueryWrapper<Info>()
                .like("title",info.getTitle()));
    }
}