package com.ljp.schedule.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/2
 * @Description
 * 增加日程的请求 /Schedule/add
 * 查询日程的请求 /Schedule/
 * 修改日程的请求
 * 删除日程的请求
 */
@WebServlet(urlPatterns = "/Schedule/*")
public class SysScheduleController extends BaseController {
    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("add");
    }
}
