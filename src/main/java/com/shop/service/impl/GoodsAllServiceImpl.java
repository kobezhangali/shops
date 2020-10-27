package com.shop.service.impl;

import com.shop.dao.GoodsAllDao;
import com.shop.entity.GoodsAll;
import com.shop.service.GoodsAllService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsAllServiceImpl implements GoodsAllService {
    @Resource
    private GoodsAllDao goodsAllDao;

    public List<GoodsAll> getGoodsAll(int gid) {
        return goodsAllDao.getGoodsAll(gid);
    }
}
