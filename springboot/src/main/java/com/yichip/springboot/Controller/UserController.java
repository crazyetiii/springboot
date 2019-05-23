package com.yichip.springboot.Controller;

import com.yichip.springboot.pojo.User;
import com.yichip.springboot.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制层 简单演示增删改查及分页
 * 新增了swagger文档内容 2018-07-21
 * @author oKong
 *
 */
@RestController
@RequestMapping("/user")
@Api(tags="用户API")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public List<User> list(User user) {
        return userService.list(user);
    }

    @RequestMapping("get")
    public User get(User user) {
        return userService.get(user);
    }

    @RequestMapping("update")
    public int update(User user) {
        return userService.update(user);
    }

    @RequestMapping("save")
    public int save(User user) {
        return userService.save(user);
    }

    @RequestMapping("delete")
    public int delete(User user) {
        return userService.delete(user);
    }

}