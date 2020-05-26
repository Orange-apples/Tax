package com.galaxy.tax.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.galaxy.tax.dao.InfoCategoryDao;
import com.galaxy.tax.entity.InfoCategory;
import com.galaxy.tax.service.InfoCategoryService;
import org.springframework.stereotype.Service;

/**
 * (TaxInfocategory)表服务实现类
 *
 * @author makejava
 * @since 2020-05-25 16:24:52
 */
@Service("taxInfocategoryService")
public class InfoCategoryServiceImpl extends ServiceImpl<InfoCategoryDao, InfoCategory> implements InfoCategoryService {

}