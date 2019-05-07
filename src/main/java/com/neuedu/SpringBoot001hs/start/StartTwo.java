package com.neuedu.SpringBoot001hs.start;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class StartTwo implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("star 2");
    }
}
