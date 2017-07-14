package com.itheima.web.result;

import cn.dsna.util.images.ValidateCode;
import com.opensymphony.xwork2.ActionInvocation;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StrutsResultSupport;

import javax.servlet.http.HttpServletResponse;


/**
 * Created by Administrator on 2017/7/14.
 * 自定义 结果类型
 * 第一步：
 *   编写一个普通类 ，继承自StrutsResultSupport的类 ，并重写doExecute方法
 *   CAPTCHA 全自动区分计算机和人类的图灵测试   验证码
 */
public class CAPTCHAResult extends StrutsResultSupport{

    //通过配置文件，调整生成图片的大小
private int width ;
private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    //servlet 原来咋写，就咋写
    protected void doExecute(String s, ActionInvocation actionInvocation) throws Exception {
        /*  验证码
         int height = 30;
        int width = 200;
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        image.getGraphics();*/
        /*
        * 使用第三方生成验证码的jar架包
        * 1.ValidateCode.jar 导包
        * 2.创建ValidateCode的对象
        * 3.获取相应对象输出流
        * 4.输出到浏览器
        * */
       //创建 ValidateCode
        //参数详解 1.图像宽、高度 2.数字的格式，3干扰线条数
        ValidateCode code = new ValidateCode(width,height,4,10);
        //获取响应对象
        HttpServletResponse response = ServletActionContext.getResponse();
        // 输出到浏览器
        code.write(response.getOutputStream());
    }
}
