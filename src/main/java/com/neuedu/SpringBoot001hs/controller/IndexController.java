package com.neuedu.SpringBoot001hs.controller;

import com.neuedu.SpringBoot001hs.entity.Goods;
import com.neuedu.SpringBoot001hs.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {

//    对比title则是通过Value取得的
    @Value("${com.neuedu.title}")
    private String title;


    @Autowired
    private User user;

    @GetMapping("/index")
    public List<User> getUser(){
        List<User> list=new ArrayList<>();
//        User user=new User();
//        user.setId(1);
//        user.setUsername("gary");
//        user.setPassword("123456");
        list.add(user);
        return list;
    }

    @GetMapping("/title")
    public String getTitle(){
        //测试lombok
        Goods goods=new Goods();
        goods.setGname("wahahah");//加了lombok就不用写get、set方法了


        return title;
    }
}
