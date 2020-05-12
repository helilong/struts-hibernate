package com.xiaohe.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaohe.dao.Dao;
import com.xiaohe.dao.DaoImpl;
import com.xiaohe.pojo.User;

import java.util.List;

public class UserAction extends ActionSupport{

    private Dao dao = new DaoImpl();
    private User user;
    private List<User> list;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("测试");
        return "show";
    }

    //添加方法
    public String finAdd(){
        dao.finAdd(user);
        System.out.println("添加方法执行");
        return "finAdd";
    }
    //刪除方法
    public String finDelete(){
        dao.finDelete(user.getId());
        System.out.println("刪除方法");
        return "finDelete";
    }
    //修改方法
    public String finUpdate(){
        dao.finUpdate(user);
        System.out.println("修改方法");
        return  "finUpdate";
    }
    //查询方法
    public String finAll(){
        System.out.println("测试");
        list = dao.finAll();
        return "finAll";
    }
    //通过id搞
    public String finEdit(){
       user = dao.get(user.getId());
        System.out.println("修改跳转页面方法执行");
        return "finEdit";
    }
}
