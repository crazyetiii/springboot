package com.yichip.springboot.Controller;

import com.yichip.springboot.pojo.User;
import com.yichip.springboot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户控制层 简单演示增删改查及分页
 * 新增了swagger文档内容 2018-07-21
 * @author oKong
 *
 */
@Slf4j
@RestController
@RequestMapping("/user/")
@Api(tags="用户API")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    @ApiOperation("获取所有用户对象")
    public List<User> list(User user) {
        log.info("获取所有用户对象");
        return userService.list(user);
    }

    @GetMapping("get")
    @ApiOperation("获取单个用户对象")
    @ApiImplicitParam(name = "user", value = "单个用户信息", dataType = "User")
    public User get(User user) {
        return userService.get(user);
    }

    @PutMapping("update")
    @ApiOperation("更新单个用户对象")
    public int update(User user) {
        return userService.update(user);
    }

    @RequestMapping(value = "save",method = RequestMethod.PUT)
    @ApiImplicitParam(name = "user", value = "单个用户信息", dataType = "User")
    @ApiOperation("新增单个用户对象")
    public int save(User user) {
        return userService.save(user);
    }

    @DeleteMapping("delete")
    @ApiOperation("删除单个用户对象")
    public int delete(User user) {
        return userService.delete(user);
    }

}