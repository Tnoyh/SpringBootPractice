package com.neuedu.SpringBoot001hs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseAppTest {
    @Test //所有的单元测试方法都必须是公有的，都没有返回值，都不能加任何参数
    public void test(){  //测试常见三种错误：语法错误、运行时错、逻辑错误

    }
}
