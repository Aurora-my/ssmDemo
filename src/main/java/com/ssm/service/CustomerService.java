package com.ssm.service;

import com.ssm.pojo.Customer;

import java.util.List;

public interface CustomerService {
    //查询全部
    List<Customer> queryAllCustomer();
}
