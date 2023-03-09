package com.ziluxike.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ziluxike.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author: ziluxike
 * Time: 2023/1/1 16:24
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
