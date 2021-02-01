package com.sihabeer.mapper;


import com.sihabeer.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

/**
 * Description
 */
@Mapper
public interface UserMapper {
    @Select("select userId,userName,permission,departmentName,phone,gender,status from user")
    List<User> adminListUser();
}
