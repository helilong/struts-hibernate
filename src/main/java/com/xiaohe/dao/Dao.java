package com.xiaohe.dao;

import com.xiaohe.pojo.User;

import java.util.List;

/**
 * dao包的接口类
 */
public interface Dao {
    //增加方法
    void finAdd(User user);

    //删除方法
    void  finDelete(int id);
    //修改方法
    void finUpdate(User user);
    //查询方法
    List<User> finAll();


    //判断登录
    User login(User user);

    //修改跳转取id
    User get(int id);

}
