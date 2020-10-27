package com.shop.service;

import com.shop.entity.GoodsUserAndFavorite;

import java.util.List;

public interface GoodsUserAndFavoriteService {
    List<GoodsUserAndFavorite> getGoodsUserAndFavorite(int uid);
}
