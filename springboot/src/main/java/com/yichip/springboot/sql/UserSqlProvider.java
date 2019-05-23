package com.yichip.springboot.sql;

/**
 * @Description TODO
 * @Author ocean
 * @Date 2019/5/2315:57
 **/
public class UserSqlProvider {
    public String userList(){
        return "select userId, userName, password, phone from t_user where 1 = 1";
    }
}
