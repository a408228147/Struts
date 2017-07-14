package com.itheima.web.action;

import com.opensymphony.xwork2.Action;

/**
 * Created by Administrator on 2017/7/13.
 * 创建动作类的第二种方式
 * 创建一个普通类，实现一个Action接口 实现接口中的方法
 */
public class demo2 implements Action {
    /*
    * Action 接口中的常量：
    * SUCCESS "success"  当执行成功之后前往指定位置
    * NONE   "none" 不返回任何结果 和return null 是一样的
    * ERROR  "error" 执行后出现异常 前往指定位置
    * INPUT  "input "  数据回显
    * LOGIN  "login"  一般用于返回登录界面
    * */
    @Override
    public String execute() throws Exception {
        return null;
    }
}
