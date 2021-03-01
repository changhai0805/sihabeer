package com.sihabeer.mapper;


import com.sihabeer.entity.User;
import org.apache.ibatis.annotations.*;


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
    @Select("select * from user where userId=#{userId}")
    User selectUserByUserId(String userId);
    @Select("select * from user where userName=#{userName}")
    List<User> findUser(String userName);
    @Update("update user set status=#{status} where userId=#{userId}")
    int updateStatus(@Param("userId") String userId,@Param("status") String status);
    @Update("update user set userName=#{userName},departmentName=#{departmentName},phone=#{phone},gender=#{gender} where userId=#{userId}")
    int updateUserInfo(User user);
    @Update("update user set userName=#{userName},departmentName=#{departmentName},pwd=#{pwd},permission=#{permission},phone=#{phone},gender=#{gender} where userId=#{userId}")
    int updateUser(User user);
    @Update("update user set pwd=#{pwd} where userId=#{userId}")
    int updatePassword(@Param("userId")String userId, @Param("pwd") String pwd);
    @Delete("delete from user where userId=#{userId}")
    int deleteUser(String userId);
    @Update("update user set pwd=#{pwd} where userName=#{userName}")
    int updatePasswordByUserName(@Param("userName")String userName, @Param("pwd") String pwd);
    @Select("select * from user where userName=#{userName}")
    List<User> selectByName(String userName);
}
