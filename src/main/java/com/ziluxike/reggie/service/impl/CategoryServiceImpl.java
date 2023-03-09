package com.ziluxike.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziluxike.reggie.common.CustomException;
import com.ziluxike.reggie.entity.Category;
import com.ziluxike.reggie.entity.Dish;
import com.ziluxike.reggie.entity.Setmeal;
import com.ziluxike.reggie.mapper.CategoryMapper;
import com.ziluxike.reggie.service.CategoryService;
import com.ziluxike.reggie.service.DishService;
import com.ziluxike.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: ziluxike
 * Time: 2023/1/3 18:02
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService{
    @Autowired
    private DishService dishService;
    @Autowired
    private SetmealService setmealService;

    @Autowired
    private CategoryService categoryService;

    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> queryWrapper1 = new LambdaQueryWrapper<>();
        queryWrapper1.eq(Dish::getCategoryId, id);
        Long count1 = dishService.count(queryWrapper1);

        if (count1 > 0) {
            throw new CustomException("当前分类项关联了菜品,不能删除！");
        }

        LambdaQueryWrapper<Setmeal> queryWrapper2 = new LambdaQueryWrapper<>();
        queryWrapper2.eq(Setmeal::getCategoryId, id);
        Long count2 = setmealService.count(queryWrapper2);

        if (count2 > 0) {
            throw new CustomException("当前分类项关联了套餐,不能删除！");
        }

        categoryService.removeById(id);
    }
}
