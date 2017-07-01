package com.gabor.service;

import com.gabor.dao.UserMapper;
import com.gabor.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Gabor on 2017/6/19.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public boolean validateName(String name){
        int record=userMapper.selectUserByName(name);
        if (0==record)return true;
        else return false;
    }
    public boolean addUser(User user) {
            int id=userMapper.addUser(user);
            if(0!=id){
               return true;
            }
            return false;
    }
}
