package com.atguigu.gmall0624.service;

import com.atguigu.gmall0624.bean.*;

import java.util.List;

public interface ManageService {
    /**
     * 查询所有一级分类
     * @return
     */
    List<BaseCatalog1> getCatalog1();
    /**
     * 根据一级分类Id 查询二级分类数据
     * @param catalog1Id
     * @return
     */
    List<BaseCatalog2> getCatalog2(String catalog1Id);
    /**
     * 根据属性查询二级分类数据
     * @param baseCatalog2
     * @return
     */
    List<BaseCatalog2> getCatalog2(BaseCatalog2 baseCatalog2);

    /**
     * 根据属性查询三级分类数据
     * @param baseCatalog3
     * @return
     */
    List<BaseCatalog3> getCatalog3(BaseCatalog3 baseCatalog3);

    /**
     * 根据属性查询平台属性数据
     * @param baseAttrInfo
     * @return
     */
    List<BaseAttrInfo> getAttrInfoList(BaseAttrInfo baseAttrInfo);

    /**
     * 添加平台属性和平台属性值
     * @param baseAttrInfo
     * @return
     */
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    /**
     * 根据id查询属性集合
     * @param attrId
     * @return
     */
    List<BaseAttrValue> getAttrValueList(String attrId);

    /**
     * 根据id查询平台属性
     * @param attrId
     * @return
     */
    BaseAttrInfo getAttrInfo(String attrId);
}
