package com.ziluxike.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziluxike.reggie.entity.Category;

/**
 * Author: ziluxike
 * Time: 2023/1/3 18:01
 */
public interface CategoryService extends IService<Category> {
    void remove(Long id);
}
