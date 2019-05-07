package com.neuedu.SpringBoot001hs.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Goods {
    private String gname;
    private Integer gid;
    private BigDecimal price;
    private long count;
}
