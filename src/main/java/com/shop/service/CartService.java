package com.shop.service;

import com.shop.entity.Cart;

import java.util.List;

/**
 * (Cart)表服务接口
 *
 * @author makejava
 * @since 2020-10-24 15:06:47
 */
public interface CartService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Cart queryById(Integer id);

    Cart queryByUid(int uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Cart> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param cart 实例对象
     * @return 实例对象
     */
    Cart insert(Cart cart);

    /**
     * 修改数据
     *
     * @param cart 实例对象
     * @return 实例对象
     */
    Cart update(Cart cart);

    int updateByUid(int num,double price,int uid);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}