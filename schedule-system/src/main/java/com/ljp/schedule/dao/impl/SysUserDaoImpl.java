package com.ljp.schedule.dao.impl;

import com.ljp.schedule.dao.BaseDao;
import com.ljp.schedule.dao.SysUserDao;
import com.ljp.schedule.pojo.SysUser;

import java.util.List;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/2
 * @Description
 */
public class SysUserDaoImpl extends BaseDao implements SysUserDao {
    @Override
    public int addSysUser(SysUser sysUser) {
        String sql ="insert into sys_user values(DEFAULT,?,?)";
        return baseUpdate(sql,sysUser.getUsername(),sysUser.getUserPwd());
    }

    @Override
    public SysUser findByUsername(String username) {
        String sql ="select uid,username,user_pwd userPwd from sys_user where username = ?";
        List<SysUser> sysUserList = baseQuery(SysUser.class, sql, username);
        return sysUserList!= null && sysUserList.size()>0? sysUserList.get(0): null ;
    }
}
