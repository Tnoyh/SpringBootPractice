package com.neuedu.SpringBoot001hs.service;

import com.github.pagehelper.PageInfo;
import com.neuedu.SpringBoot001hs.entity.User;

import java.util.List;

public interface UserService {

    PageInfo getUserList(int curPage, int pageSize);  //显示的时候一般不会都显示出来，会有分页

    User getUser(Integer id);  //得到一条数据

    void insert(User user);    //插入

    void update(User user);    //修改

    void delete(Integer... ids);//有可能会批量删除，不止根据一个id，所以点点点或者数组
}
