package com.ziluxike.reggie.dto;

import com.ziluxike.reggie.entity.Setmeal;
import com.ziluxike.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.List;

/**
 * Author: ziluxike
 * Time: 2023/1/14 04:56
 */
@Data
public class SetmealDto extends Setmeal {
    private List<SetmealDish> setmealDishes;
    private String categoryName;
}
