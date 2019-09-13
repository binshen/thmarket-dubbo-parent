package com.thmarket.service;

import com.thmarket.model.UserAddress;

import java.util.List;

public interface OrderService {

    /**
     * 初始化订单
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);
}
