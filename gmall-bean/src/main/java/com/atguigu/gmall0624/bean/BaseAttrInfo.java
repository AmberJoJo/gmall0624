package com.atguigu.gmall0624.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
public class BaseAttrInfo implements Serializable{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)//表示获取主键自增
    private String id;
    @Column
    private String attrName;
    @Column
    private String catalog3Id;

    //attrValueList字段不属于数据库，添加一个注解 属性名称不能随便修改
    @Transient
    private List<BaseAttrValue> attrValueList;
}
