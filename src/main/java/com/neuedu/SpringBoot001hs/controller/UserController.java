package com.neuedu.SpringBoot001hs.controller;

import com.neuedu.SpringBoot001hs.entity.User;
import com.neuedu.SpringBoot001hs.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/userIndex")
    public ModelAndView userIndex(){
//        List<User> list = userService.getUserList();
//        ModelMap map=new ModelMap();
//        map.addAttribute("title","jsp测试");
//        ModelAndView modelView=new ModelAndView("userIndex",map);
        log.info("控制输出");
//        return modelView;
        ModelMap model=new ModelMap();
        model.addAttribute("name","thymeleaf");
        return new ModelAndView("index",model);
    }
}
