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
}