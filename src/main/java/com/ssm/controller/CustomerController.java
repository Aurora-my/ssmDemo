package com.ssm.controller;

import com.ssm.aop.SystemControllerLog;
import com.ssm.pojo.Customer;
import com.ssm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @RequestMapping("/queryAllCustomer")
    //此处为记录AOP拦截Controller记录用户操作
    @SystemControllerLog(description = "查询数据")
    public String list(Model model) {
        List<Customer> list = service.queryAllCustomer();
        model.addAttribute("list", list);
        return "allCustomer";
    }

}
