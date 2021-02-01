package com.sihabeer.service;

import com.sihabeer.entity.User;

import java.util.List;

public interface UserService {
    List<User> adminListUser(int pageNum, int pageSize);
}
