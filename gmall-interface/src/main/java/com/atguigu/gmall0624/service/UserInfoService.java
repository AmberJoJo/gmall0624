package com.atguigu.gmall0624.service;



import com.atguigu.gmall0624.bean.UserAddress;
import com.atguigu.gmall0624.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    /*
    查询所有用户信息方法
     */
    List<UserInfo> findAll();
    //可以根据用户的名字，id，等其他已知信息进行查询
    List<UserInfo> findUserInfo(UserInfo userInfo);
    //模糊查询
    List<UserInfo> findByNickName(String nickName);
    /**
     * 添加数据
     * @param userInfo
     */
    void addUser(UserInfo userInfo);
    /**
     * 修改数据
     * @param userInfo
     */
    void upUserInfo(UserInfo userInfo);
    /**
     * 删除数据
     * @param userInfo
     */
    void delUser(UserInfo userInfo);
    /**
     * 根据用户id查询地址
     * @param userId
     * @return
     */
    List<UserAddress> findUserAddressListByUserId(String userId);
    /**
     * 根据用户id查询地址
     * @param userAddress
     * @return
     */
    List<UserAddress> findUserAddressListByUserId(UserAddress userAddress);
}
