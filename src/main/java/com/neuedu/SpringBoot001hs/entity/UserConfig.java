package com.neuedu.SpringBoot001hs.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component  //@Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注
@ConfigurationProperties(prefix = "com.neuedu.user")
public class UserConfig {

    private Integer id;
    private String username;
    private String password;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
