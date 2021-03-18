package com.ssm.service.impl;

import com.ssm.aop.SystemServiceLog;
import com.ssm.dao.CustomerMapper;
import com.ssm.pojo.Customer;
import com.ssm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper mapper;

    @Override
    @SystemServiceLog(description = "查询数据")
    public List<Customer> queryAllCustomer() {
        return mapper.queryAllCustomer();
    }
}
