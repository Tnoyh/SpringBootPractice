package com.neuedu.SpringBoot001hs.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.SpringBoot001hs.BaseAppTest;
import com.neuedu.SpringBoot001hs.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@Slf4j
public class UserMapperTest extends BaseAppTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertUser() {

        User user = new User();
        user.setUser("zhangsan");
        user.setPassword("123456");
        user.setPhone("13688886666");
        user.setEmail("hhhh@jjk.com");
        user.setCreatetime(new Date());
        user.setStatus(0);//默认0就是正常的,1就是禁用的
        //本次插入25条数据,最好用批处理
        int count = 0;
        for (int i = 0; i < 25; i++) {
            count = userMapper.insertUser(user);
        }

        Assert.assertEquals("影响的行数", 1, count);
    }

    @Test
    public void selectAll() {
        //写分页直接在最上方加个分页就行
        PageHelper.startPage(1, 3);

        List<User> list = userMapper.selectAll();
        PageInfo pageInfo = new PageInfo(list);//PageInfo里有许多方法，关于分页的信息，看简书
        log.info(list.size() + "记录数");
        for (User user : list) {
            log.info("读取数据" + user.toString());
            Assert.assertTrue("读取记录", list.size() > 0);
        }
    }

}