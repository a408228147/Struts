package com.itheima.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/7/14.
 * 获取ServletAPI
 * 第一种
 * 使用的是ServletActionContext的对像 推荐使用
 * 第二种
 * 使用的是依赖注入的形式 ，把我们想要的对象注入进来
 *  是由一个拦截器为我们做的
 */
public class demo4Action extends ActionSupport implements ServletResponseAware,ServletRequestAware,ServletContextAware{
private HttpServletRequest request;
private HttpServletResponse response;
private ServletContext application;


public String execute(){
    /*HttpServletRequest request = ServletActionContext.getRequest();
    HttpServletResponse response = ServletActionContext.getResponse();
    ServletContext application = ServletActionContext.getServletContext();*/
    HttpSession session = request.getSession();
    System.out.println(request);
    System.out.println(response);
    System.out.println(application);
    System.out.println(session);

    return null;

}
    @Override
    public void setServletResponse(HttpServletResponse response) {
  this.response = response;
    }

    @Override
    public void setServletContext(ServletContext application) {
this.application = application;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
this.request = request;
    }
}
