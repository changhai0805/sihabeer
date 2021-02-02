package com.sihabeer.service;

import com.sihabeer.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserService {
    List<User> adminListUser(int pageNum, int pageSize);

    int insertUserInfo(User user);

    int selectUserByIdAndPassword(User user);

    List<User> findUser(String userName,int pageNum, int pageSize);
}
