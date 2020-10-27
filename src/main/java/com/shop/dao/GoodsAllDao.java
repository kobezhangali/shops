package com.shop.dao;


import com.shop.entity.GoodsAll;

import java.util.List;

//查询商品所有信息
public interface GoodsAllDao {
    List<GoodsAll> getGoodsAll(int gid);
}
