package com.ljp.schedule.dao;

import com.ljp.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/2
 * @Description
 */
public interface SysScheduleDao {

    /**
     * 用于向数据中增加一条记录
     * @param sysSchedule 日程数据以SysSchedule实体类对象形式入参
     * @return 返回影响数据库记录的行数，行数0说明为增加失败，行数大于0说明增加成功
     */
    int addSchedule(SysSchedule sysSchedule);

    /**
     * 查询所有用户的所有日程
     * @return 将所有日程放入一个:List<SysSchedule>集合中返回
     */
    List<SysSchedule> findAll();
}
