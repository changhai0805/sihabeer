package com.sihabeer.mapper;


import com.sihabeer.entity.User;
import org.apache.ibatis.annotations.Insert;
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
    @Insert("insert into user(userId,userName,pwd,permission,departmentName,phone,gender) " +
            "values(#{userId},#{userName},#{pwd},#{permission},#{departmentName},#{phone},#{gender})")
    int insertUserInfo(User user);
    @Select("select * from user where userId=#{userId} and pwd=#{pwd}")
    User selectUserByIdAndPassword(User user);
    @Select("select * from user where userName=#{userName}")
    List<User> findUser(String userName);
}
