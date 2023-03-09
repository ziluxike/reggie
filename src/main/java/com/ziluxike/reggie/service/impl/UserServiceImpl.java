package com.ziluxike.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziluxike.reggie.entity.User;
import com.ziluxike.reggie.mapper.UserMapper;
import com.ziluxike.reggie.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Author: ziluxike
 * Time: 2023/1/16 02:07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
