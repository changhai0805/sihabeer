package com.sihabeer.controller;

import com.github.pagehelper.PageInfo;
import com.sihabeer.entity.User;
import com.sihabeer.service.UserService;
import com.sihabeer.util.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
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
    public CommonResult login(User user) {
        if(user==null){
            System.out.println("参数为空！");
        }
        return userService.selectUserByIdAndPassword(user);
    }
    @RequestMapping("find")
    public PageInfo<User> findUser(String userName,@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "6") int pageSize) {
        if(userName.trim().equals("")||userName==null){
            List<User> list = userService.adminListUser(pageNum,pageSize);
            PageInfo<User> pageInfo = new PageInfo<>(list);
            return pageInfo;
        }
        List<User> list = userService.findUser(userName,pageNum,pageSize);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @RequestMapping("updateStatus")
    public int updateStatus(String userId,String status){
        return userService.updateStatus(userId,status);
    }
    @RequestMapping("updatePassword")
    public int updatePassword(String userId,String password){
        return userService.updatePassword(userId,password);
    }
    @RequestMapping("updateUserInfo")
    public int updateUserInfo(User user){
        return userService.updateUserInfo(user);
    }
}