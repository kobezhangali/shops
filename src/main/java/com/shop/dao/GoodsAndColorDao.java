package com.shop.dao;

import com.shop.entity.GoodsAndColor;

import java.util.List;

public interface GoodsAndColorDao {
    List<GoodsAndColor> getGoodsAndColor(int bid);
}
