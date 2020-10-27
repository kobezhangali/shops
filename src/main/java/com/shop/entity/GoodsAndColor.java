package com.shop.entity;

import lombok.Data;

@Data
public class GoodsAndColor {
    private Integer gid;
    private Integer cid;
    private String gname;
    private Object oprice;
    private Object nprice;
    private String color;
    private String picture;
}
