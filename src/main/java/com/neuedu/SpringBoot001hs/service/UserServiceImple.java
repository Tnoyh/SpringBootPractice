package com.neuedu.SpringBoot001hs.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageInfo getUserList(int curPage, int pageSize) {
        PageHelper.startPage(curPage, pageSize);
        List<User> list = userMapper.selectAll();
        //如果要显示当前页，下一页等就要写PageInfo⚠️⚠️⚠️⚠️⚠️
        PageInfo pageInfo = new PageInfo(list);
        //写完PageInfo返回就不能返回list⚠️⚠️⚠️ 而是要返回PageInfo 包括service里也是返回PageInfo
        return pageInfo;
    }

    @Override
    public User getUser(Integer id) {
        return null;
    }

    @Override
    public void insert(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Integer... ids) {

    }
}
