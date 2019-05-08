package com.neuedu.SpringBoot001hs;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(value = "com.neuedu.SpringBoot001hs.mapper")
public class Applic {

	static Logger logger= LoggerFactory.getLogger(Applic.class);

	public static void main(String[] args) {


		//两种方法
		//SpringApplication.run(Applic.class, args);


		SpringApplication application=new SpringApplication(Applic.class);
		//手动设置命令行不起作用
		//application.setAddCommandLineProperties(false);
		application.run(args);
		//System.out.println("main");

	}

}
