package com.ziluxike.reggie.dto;

import com.ziluxike.reggie.entity.Dish;
import com.ziluxike.reggie.entity.DishFlavor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: ziluxike
 * Time: 2023/1/6 00:37
 */
@Data
public class DishDto extends Dish {
    private List<DishFlavor> flavors = new ArrayList<>();
    private String categoryName;
    private String copies;
}
