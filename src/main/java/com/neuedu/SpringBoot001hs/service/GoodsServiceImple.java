package com.neuedu.SpringBoot001hs.service;

import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImple implements GoodsService {

    //测试 模拟一个业务方法
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
