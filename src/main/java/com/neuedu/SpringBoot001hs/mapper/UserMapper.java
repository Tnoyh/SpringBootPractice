package com.neuedu.SpringBoot001hs.mapper;

import com.neuedu.SpringBoot001hs.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository   //@Repository用于标注数据访问组件，即DAO组件.
public interface UserMapper {

    int insertUser(User user);//插入数据

    List<User> selectAll();//查询所有


}
