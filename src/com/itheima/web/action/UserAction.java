package com.itheima.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2017/7/13.
 */
public class UserAction extends ActionSupport {
    public String addUser(){
        //server ser
        System.out.println("添加用户");
        return SUCCESS;
    }
    public String deleteUser(){
        //server ser
        System.out.println("删除用户");
        return SUCCESS;
    }

}
