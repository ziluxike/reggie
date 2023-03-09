package com.ziluxike.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziluxike.reggie.dto.DishDto;
import com.ziluxike.reggie.entity.Dish;

/**
 * Author: ziluxike
 * Time: 2023/1/3 19:42
 */
public interface DishService extends IService<Dish> {
    /**
     * 新增菜品, 并添加菜品对应的口味信息到数据库
     * @param dto
     */
    public void saveWithDish(DishDto dto);

    /**
     * 根据id查询菜品信息和对应口味信息
     * @param id
     * @return
     */
    public DishDto getByIdWithFlavor(Long id);

    /**
     * 更新菜品信息和对应口味信息
     * @param dishDto
     */
    public void updateWithFlavor(DishDto dishDto);
}
