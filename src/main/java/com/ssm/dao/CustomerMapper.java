package com.ssm.dao;

import com.ssm.pojo.Customer;

import java.util.List;

public interface CustomerMapper {
    //查询全部
    List<Customer> queryAllCustomer();
}
