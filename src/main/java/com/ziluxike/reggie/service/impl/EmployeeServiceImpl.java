package com.ziluxike.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziluxike.reggie.entity.Employee;
import com.ziluxike.reggie.mapper.EmployeeMapper;
import com.ziluxike.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * Author: ziluxike
 * Time: 2023/1/1 16:26
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService{
}
