package com.shop.controller;

import com.shop.entity.GoodsUserAndFavorite;
import com.shop.service.GoodsUserAndFavoriteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("GoodsUserAndFavorite")
public class GoodsUserAndFavoriteController {

    @Resource
    private GoodsUserAndFavoriteService goodsUserAndFavoriteService;
    //查询用户收藏的所有商品
    @GetMapping("getGoodsUserAndFavorite/{uid}")
    public List<GoodsUserAndFavorite> getGoodsUserAndFavorite(@PathVariable("uid") int uid){
    return goodsUserAndFavoriteService.getGoodsUserAndFavorite(uid);
    }
}
