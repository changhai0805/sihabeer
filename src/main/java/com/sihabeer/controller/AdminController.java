package com.sihabeer.controller;

import com.github.pagehelper.PageInfo;
import com.sihabeer.entity.User;
import com.sihabeer.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Resource
    private UserService userService;
    @RequestMapping("selectAllUser")
    public PageInfo<User> selectAllUser(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "6") int pageSize) {
        List<User> list = userService.adminListUser(pageNum,pageSize);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @RequestMapping("insertUser")
    public int insertUser(User user) {
        return userService.insertUserInfo(user);
    }
    @RequestMapping("login")
    public int login(User user) {

        return userService.selectUserByIdAndPassword(user);
    }
    @RequestMapping("find")
    public PageInfo<User> findUser(String userName,@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "6") int pageSize) {
        List<User> list = userService.findUser(userName,pageNum,pageSize);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}