package com.ziluxike.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ziluxike.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author: ziluxike
 * Time: 2023/1/16 02:05
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
