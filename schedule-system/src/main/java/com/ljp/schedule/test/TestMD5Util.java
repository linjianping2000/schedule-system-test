package com.ljp.schedule.test;

import com.ljp.schedule.util.MD5Util;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/2
 * @Description
 */
public class TestMD5Util {
    public static void main(String[] args) {
        String encrypt = MD5Util.encrypt("123456");
        System.out.println(encrypt);
    }
}
