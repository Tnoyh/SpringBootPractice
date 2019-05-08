package com.neuedu.SpringBoot001hs.service;

import com.neuedu.SpringBoot001hs.entity.User;
import com.neuedu.SpringBoot001hs.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImple implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        List<User> list=userMapper.selectAll();
        return list;
    }
}
