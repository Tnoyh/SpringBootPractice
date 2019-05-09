package com.neuedu.SpringBoot001hs.controller;

import com.neuedu.SpringBoot001hs.entity.Goods;
import com.neuedu.SpringBoot001hs.entity.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {

    //    对比title则是通过Value取得的
    @Value("${com.neuedu.title}")
    private String title;


    @Autowired
    private UserConfig userConfig;

    @GetMapping("/index")
    public List<UserConfig> getUserConfig() {
        List<UserConfig> list = new ArrayList<>();
//        User user=new User();
//        user.setId(1);
//        user.setUsername("gary");
//        user.setPassword("123456");
        list.add(userConfig);
        return list;
    }

    @GetMapping("/thymeleaf")
    public ModelAndView getThymeleaf() {


        ModelMap map = new ModelMap();
        map.addAttribute("name", "测试thymeleaf整合");
        return new ModelAndView("index", map);
        //ModelAndView modelView=new ModelAndView("index",map);
        //log.info("控制输出");
        //return modelView;

        //return title;
    }

    @GetMapping("/title")
    public String getTitle() {
        //测试lombok
        Goods goods = new Goods();
        goods.setGname("wahahah");///加了lombok就不用写get、set方法了


        //ModelAndView modelView=new ModelAndView("index",map);
        //log.info("控制输出");
        //return modelView;

        return title;
    }
}
