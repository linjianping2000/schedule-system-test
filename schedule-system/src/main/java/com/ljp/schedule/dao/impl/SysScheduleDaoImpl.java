package com.ljp.schedule.dao.impl;

import com.ljp.schedule.dao.BaseDao;
import com.ljp.schedule.dao.SysScheduleDao;
import com.ljp.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/2
 * @Description
 */
public class SysScheduleDaoImpl extends BaseDao implements SysScheduleDao {
    @Override
    public int addSchedule(SysSchedule schedule) {
        String sql ="insert into sys_schedule values(DEFAULT,?,?,?)";
        int rows = baseUpdate(sql,schedule.getUid(),schedule.getTitle(),schedule.getCompleted());
        return rows;
    }

    @Override
    public List<SysSchedule> findAll() {
        String sql ="select sid,uid,title,completed from sys_schedule";
        List<SysSchedule> scheduleList = baseQuery(SysSchedule.class, sql);
        return scheduleList;
    }
}
