package com.ziluxike.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziluxike.reggie.entity.OrderDetail;
import com.ziluxike.reggie.mapper.OrderDetailMapper;
import com.ziluxike.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * Author: ziluxike
 * Time: 2023/1/30 02:42
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
