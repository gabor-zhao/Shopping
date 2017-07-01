package com.gabor.dao;

import com.gabor.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Gabor on 2017/6/19.
 */
public interface UserMapper {
    @Select("select name from user where id = #{id}")
    String selectUserById(Integer id);
    @Select("select count(*) from user where name = #{name}")
    int selectUserByName(String name);
    @Insert("insert into user(name,pwd,email,phoneNum) values(#{name},#{password},#{email},#{phoneNum})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int addUser(User user);
}
