package com.ziluxike.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ziluxike.reggie.entity.AddressBook;
import com.ziluxike.reggie.mapper.AddressBookMapper;
import com.ziluxike.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

/**
 * Author: ziluxike
 * Time: 2023/1/16 07:24
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
