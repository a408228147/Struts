package com.itheima.web.action;

/**
 * Created by Administrator on 2017/7/13.
 *
 * 创建动作类的第一种方式
 * 创建一个普通的java类
 * 他就一个POJO 原始的老的java对象
 * Plain Old  java object
 */
public class HelloAction {//动作类
    //指定的动作方法
    /*
    * 动作方法书写要求
    * 1.都是public
    * 2.返回值必须是一个String
    * 3.必须没有参数
    * */
    public  String sayHello()
    {
        System.out.println("sayHello");
        return  "success";//与配置文件中result的name值相对应
    }
}
