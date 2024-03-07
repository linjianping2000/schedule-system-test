package com.ljp.schedule.dao;

import com.ljp.schedule.pojo.SysUser;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/2
 * @Description
 */
public interface SysUserDao {
    /**
     * 向数据库中增加一条用户记录的方法
     * @param sysUser 要增加记录的username 和 user_pwd字段以SysUser实体类对象的形式接收
     * @return 成功返回1 失败返回0
     */
    int addSysUser(SysUser sysUser);

    /**
     * 根据用户名获得完整用户信息的方法
     * @param username 要查询的用户名
     * @return 如果找到了返回SysUser对象,找不到返回null
     */
    SysUser findByUsername(String username);
}
