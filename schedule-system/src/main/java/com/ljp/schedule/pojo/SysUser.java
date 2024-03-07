package com.ljp.schedule.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/2
 * @Description
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;
}
