package com.galaxy.tax.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.galaxy.tax.entity.Account;
import com.galaxy.tax.entity.Info;
import java.util.List;

/**
 * (Info)表服务接口
 *
 * @author makejava
 * @since 2020-05-25 15:32:51
 */
public interface InfoService extends IService<Info> {


    Page<Info> queryAll(Integer pages, Info info);
}