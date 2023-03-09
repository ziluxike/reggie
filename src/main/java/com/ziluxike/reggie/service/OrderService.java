package com.ziluxike.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziluxike.reggie.common.R;
import com.ziluxike.reggie.entity.Orders;

/**
 * Author: ziluxike
 * Time: 2023/1/30 02:07
 */
public interface OrderService extends IService<Orders> {

    public void submit(Orders orders);
}
