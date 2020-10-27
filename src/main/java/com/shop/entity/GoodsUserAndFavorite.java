package com.shop.entity;

import lombok.Data;

@Data
public class GoodsUserAndFavorite {
    private int gid;
    private int uid;
    private int fid;

    private String gname;
    private Object oprice;
    private Object nprice;
    private String texture;
}
