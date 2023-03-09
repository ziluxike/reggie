package com.ziluxike.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziluxike.reggie.entity.ShoppingCart;
import com.ziluxike.reggie.mapper.ShoppingCartMapper;
import com.ziluxike.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/**
 * Author: ziluxike
 * Time: 2023/1/30 00:28
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
