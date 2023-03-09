package com.ziluxike.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ziluxike.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author: ziluxike
 * Time: 2023/1/30 02:05
 */
@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
