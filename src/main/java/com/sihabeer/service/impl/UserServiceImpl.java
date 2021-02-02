package com.sihabeer.service.impl;

import com.github.pagehelper.PageHelper;
import com.sihabeer.entity.User;
import com.sihabeer.mapper.UserMapper;
import com.sihabeer.service.UserService;
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
        return userMapper.insertUserInfo(user);
    }

    @Override
    public int selectUserByIdAndPassword(User user) {
        User result = userMapper.selectUserByIdAndPassword(user);
        if(result == null){
            return 0;
        }else if(result.getStatus().equals("禁用")){
            return 2;
        }
        return 1;
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
    public int updatePassword(String userId, String password) {
        return userMapper.updatePassword(userId,password);
    }
}