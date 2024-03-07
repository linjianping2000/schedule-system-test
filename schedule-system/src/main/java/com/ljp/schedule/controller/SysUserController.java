package com.ljp.schedule.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ljp.schedule.common.Result;
import com.ljp.schedule.common.ResultCodeEnum;
import com.ljp.schedule.pojo.SysUser;
import com.ljp.schedule.service.SysUserService;
import com.ljp.schedule.service.impl.SysUserServiceImpl;
import com.ljp.schedule.util.MD5Util;
import com.ljp.schedule.util.WebUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/2
 * @Description
 */
@WebServlet(urlPatterns = "/user/*")
public class SysUserController extends BaseController {

    private SysUserService userService = new SysUserServiceImpl();

    /**
     * 注册时，接收要注册的用户名，校验用户名是否被占用的业务接口
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void checkUsernameUsed(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收用户名
        String username = req.getParameter("username");
        //调用服务层业务处理方法查询该用于名是否有对应的用户
        SysUser SysUser = userService.findByUsername(username);

        Result result = Result.ok(null);

        if (null != SysUser){
            result = Result.build(null, ResultCodeEnum.USERNAME_USED);
        }
        //将result对象转换为JSON串响应给客户端
        WebUtil.writeJson(resp,result);
    }

    /**
     * 接收用登录请求,完成的登录业务接口
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 接收用户名和密码
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        //2 调用服务层方法,根据用户名查询用户信息
        SysUser loginUser =userService.findByUsername(username);
        if(null == loginUser){
            // 跳转到用户名有误提示页
            resp.sendRedirect("/loginUsernameError.html");
        }else if(! MD5Util.encrypt(userPwd).equals(loginUser.getUserPwd())){
            //3 判断密码是否匹配
            // 跳转到密码有误提示页
            resp.sendRedirect("/loginUserPwdError.html");
        }else{
            // 登录成功之后,将登录的用户信息放入session
            HttpSession session = req.getSession();
            session.setAttribute("sysUser",loginUser);


            //4 跳转到首页
            resp.sendRedirect("/showSchedule.html");
        }

    }

    /**
     * 接受用户注册请求业务处理方法（业务接口  不是java中的interface）
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收客户端提交的参数
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        //调用服务成方法，完成注册功能
        SysUser sysUser = new SysUser(null,username,userPwd);
        int rows = userService.regist(sysUser);
        //根据注册结果（成功 失败）做页面跳转
        if (rows>0){
            resp.sendRedirect("/registSuccess.html");
        }else {
            resp.sendRedirect("/registFail.html");
        }
    }
}
