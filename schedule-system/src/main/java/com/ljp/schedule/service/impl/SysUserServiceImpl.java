package com.ljp.schedule.service.impl;

import com.ljp.schedule.dao.SysUserDao;
import com.ljp.schedule.dao.impl.SysUserDaoImpl;
import com.ljp.schedule.pojo.SysUser;
import com.ljp.schedule.service.SysUserService;
import com.ljp.schedule.util.MD5Util;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/2
 * @Description
 */
public class SysUserServiceImpl implements SysUserService {

    private SysUserDao userDao = new SysUserDaoImpl();

    @Override
    public int regist(SysUser sysUser) {
        //将用户的明文密码转换为密文密码
        sysUser.setUserPwd(MD5Util.encrypt(sysUser.getUserPwd()));
        //调用Dao层的方法，将sysUser信息存入数据库
        return userDao.addSysUser(sysUser) ;
    }

    @Override
    public SysUser findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
