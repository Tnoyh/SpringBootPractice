package com.neuedu.SpringBoot001hs.controller;

import com.github.pagehelper.PageInfo;
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
    public ModelAndView userIndex(Integer pageNum, Integer pageSize) {
        //因为写了分页 所以用PageInfo替换List<User>
        //此分页为mybatis分页，后期会学习springData的分页
        PageInfo pageInfo = userService.getUserList(pageNum, pageSize);
        ModelMap map = new ModelMap();
        map.addAttribute("pageInfo", pageInfo);
        ModelAndView modelView = new ModelAndView("userIndex", map);
//        log.info("控制输出");
        return modelView;

        //thymeleaf测试⚠️
        /*ModelMap model=new ModelMap();
        model.addAttribute("name","thymeleaf");
        return new ModelAndView("index",model);*/
    }
}
