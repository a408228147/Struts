package com.itheima.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Administrator on 2017/7/14.
 *
 * 动态参数封装
 * 第一种
 * 数据模型 与动作类写在一起
 *
 * 第二种分开
 *  调用模型
 *
 *  第三种：模型驱动
 * 要想使用模型驱动，必须数据模型与动作类分开写
 * 实现模型驱动的步骤：
 * 1。实现一个ModelDriver的接口
 * 2.实现接口中的抽象方法getModel（）
 * 3.使用时数据模型必须由我们自己实例化
 * 是由一个ModelDriver的拦截器为我们做的
 * 实际开发中采用的方式
 */
/*public class adduser  extends ActionSupport{
  *//* private String username;
    public String addUser(){
        System.out.println(username);
     return null;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }*//*
usermodel um;
public String addUser(){
    System.out.println(um.getUsername());
    return null;
}

    public usermodel getUm() {
        return um;
    }

    public void setUm(usermodel um) {
        this.um = um;
    }
}*/
public class adduser  extends ActionSupport implements ModelDriven<usermodel> {
    private usermodel um = new usermodel(); // 使用驱动模型 必须实例化
    //返回的数据模型
    @Override
    public usermodel getModel() {
        return um;
    }

    public usermodel getUm() {
        return um;
    }

    public void setUm(usermodel um) {
        this.um = um;
    }

    public String addUser(){

        return null;

    }

}