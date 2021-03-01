package com.sihabeer.service.impl;

import com.github.pagehelper.PageHelper;
import com.sihabeer.entity.User;
import com.sihabeer.mapper.UserMapper;
import com.sihabeer.service.UserService;
import com.sihabeer.util.CommonResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> adminListUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.adminListUser();
    }

    @Override
    public int insertUserInfo(User user) {
        if(user!=null){
            String userName = user.getUserName();
            List<User> list = userMapper.selectByName(userName);
            if(list!=null || list.size()>0){
                String id= list.get(0).getUserId();
                user.setUserId(id);
                return userMapper.updateUser(user);
            }
            return userMapper.insertUserInfo(user);
        }else {
            return 0;
        }

    }

    @Override
    public CommonResult selectUserByIdAndPassword(User user) {
        User result = userMapper.selectUserByIdAndPassword(user);
        if(result == null){
            return new CommonResult(0,"用户名或密码错误！",0);
        }else if(result.getStatus().equals("禁用")){
            return new CommonResult(2,"用户已被禁用，请联系管理员！",2);
        }
        return new CommonResult(1,"登录成功！",result);
    }

    @Override
    public List<User> findUser(String userName, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.findUser(userName);
    }

    @Override
    public int updateStatus(String userId, String status) {
        return userMapper.updateStatus(userId,status);
    }

    @Override
    public int updateUserInfo(User user) {
        return userMapper.updateUserInfo(user);
    }

    @Override
    public int updatePassword(String userId, String pwd) {
        return userMapper.updatePassword(userId,pwd);
    }

    @Override
    public Boolean checkUserId(String userId) {
        User user = userMapper.selectUserByUserId(userId);
        if(user==null){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public int deleteUser(String userId) {
        return userMapper.deleteUser(userId);
    }

    @Override
    public int updatePasswordByUserName(String userName, String password) {
        return userMapper.updatePasswordByUserName(userName,password);
    }
}