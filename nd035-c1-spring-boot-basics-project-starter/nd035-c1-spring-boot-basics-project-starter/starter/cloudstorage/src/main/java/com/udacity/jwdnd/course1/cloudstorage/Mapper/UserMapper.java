package com.udacity.jwdnd.course1.cloudstorage.Mapper;

import com.udacity.jwdnd.course1.cloudstorage.Model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("Select * FROM USERS WHERE username=#{username}")
    User getUser(String username);

    @Insert("Insert into users (username,salt,password,firstname,lastname) Values(#{username},#{salt},#{password},#{firstname},#{lastname})")
    @Options(useGeneratedKeys = true,keyProperty = "userid")
    int insert(User user);
}
