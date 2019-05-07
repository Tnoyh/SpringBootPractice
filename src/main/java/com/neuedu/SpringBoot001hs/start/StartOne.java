package com.neuedu.SpringBoot001hs.start;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sun.awt.SunHints;

@Component
@Order(value = 1)
public class StartOne implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {//多个参数，类似于数组
        System.out.println("star 1");
    }
}
