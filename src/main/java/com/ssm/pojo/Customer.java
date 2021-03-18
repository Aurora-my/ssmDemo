package com.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String pk_customer;     //主键
    private String pk_org;  //组织
    private String code;    //客户代码
    private String name;    //客户名称
    private String def43;// 大区
    private String def2;// 办事处
    private String def3;// 办事处层级
    private String def4;// 办事处人均消费
    private String def6;// 新开所属省/区/直辖市
    private String def7;// 新开所属地/州/市
    private String def8;// 新开所属区/县
    private String def23;// 授权销售区域
    private String def24;// 授权区域人口
    private String def25;// 授权区域人均消费
    private String def10;// 注册地址
    private String def20;// 经销商属性
    private String pk_customer_main;// 销售计入上级经销商
    private String def41;// 返利计入上级经销商
    private String def21;// 产品价格
    private String def22;// 利返情况
    private String def40;// 授权渠道
    private String def28;// 销售目标
    private String pk_custclass;// 客户资源投放分类
    private String def1;// 冲抵比例
    private String pk_areacl;// 地区分类
    private String ts; ///更新時間
}
