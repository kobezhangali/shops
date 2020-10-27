package com.shop.service.impl;

import com.shop.dao.GoodsAndColorDao;
import com.shop.entity.GoodsAndColor;
import com.shop.service.GoodsAndColorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsAndColorServiceImpl implements GoodsAndColorService {
    @Resource
    private GoodsAndColorDao goodsAndColorDao;

    public List<GoodsAndColor> getGoodsAndColor(int bid) {
        return goodsAndColorDao.getGoodsAndColor(bid);
    }
}
