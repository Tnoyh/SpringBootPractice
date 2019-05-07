package com.neuedu.SpringBoot001hs.service;

import com.neuedu.SpringBoot001hs.BaseAppTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

@Slf4j
public class GoodsServiceTest extends BaseAppTest {

    @Autowired//自动装配一个对象
    private GoodsService goodsService;


    @Before
    public void setUp() throws Exception {
        log.info("Before");//运行之前 我需要读文件 就放在before
    }

    @After
    public void tearDown() throws Exception {
        log.info("After");
    }

    @Test
    public void add(){
        //log.info("Test");
        //接下来进行测试，加一个断言测试 1+1肯定等于2的
        Integer sum=goodsService.add(1,1);
        Assert.assertTrue("两数相加和：",sum==2);//后边是一个布尔值

        //如果在GoodsServiceImple里将return 的值改为 a-b，则会报测试的错误
    }
}