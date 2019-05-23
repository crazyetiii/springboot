package com.yichip.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TODO
 * @Author ocean
 * @Date 2019/5/2311:32
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDomain {
    private Integer userId;

    private String userName;

    private String password;

    private String phone;
}
