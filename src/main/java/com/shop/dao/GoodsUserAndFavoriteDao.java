package com.shop.dao;

import com.shop.entity.GoodsUserAndFavorite;

import java.util.List;

public interface GoodsUserAndFavoriteDao {
    List<GoodsUserAndFavorite> getGoodsUserAndFavorite(int uid);
}
