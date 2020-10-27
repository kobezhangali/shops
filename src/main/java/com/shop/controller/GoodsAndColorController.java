package com.shop.controller;

import com.shop.entity.GoodsAndColor;
import com.shop.service.GoodsAndColorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("goodsAndColor")
public class GoodsAndColorController {
    @Resource
    private GoodsAndColorService goodsAndColorService;
    //根据品牌查询所有商品带图片
    @GetMapping("/getGoodsAndColor/{bid}")
    public List<GoodsAndColor> getGoodsAndColor(@PathVariable("bid") int bid){
        return goodsAndColorService.getGoodsAndColor(bid);
    }

}
