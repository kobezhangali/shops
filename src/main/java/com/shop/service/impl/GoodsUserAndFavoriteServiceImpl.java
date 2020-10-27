package com.shop.service.impl;

import com.shop.dao.GoodsUserAndFavoriteDao;
import com.shop.entity.GoodsUserAndFavorite;
import com.shop.service.GoodsUserAndFavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsUserAndFavoriteServiceImpl implements GoodsUserAndFavoriteService {
    @Resource
    private GoodsUserAndFavoriteDao goodsUserAndFavoriteDao;


    public List<GoodsUserAndFavorite> getGoodsUserAndFavorite(int uid) {
        return goodsUserAndFavoriteDao.getGoodsUserAndFavorite(uid);
    }
}
