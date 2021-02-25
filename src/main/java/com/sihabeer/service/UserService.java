package com.sihabeer.service;

import com.sihabeer.entity.User;
import com.sihabeer.util.CommonResult;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserService {
    List<User> adminListUser(int pageNum, int pageSize);

    int insertUserInfo(User user);

    CommonResult selectUserByIdAndPassword(User user);

    List<User> findUser(String userName,int pageNum, int pageSize);

    int updateStatus(String userId,String status);

    int updateUserInfo(User user);

    int updatePassword(String userId,String password);

    Boolean checkUserId(String userId);

    int deleteUser(String userId);
}
