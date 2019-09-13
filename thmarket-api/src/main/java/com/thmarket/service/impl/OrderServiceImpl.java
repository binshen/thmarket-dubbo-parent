package com.thmarket.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.thmarket.model.UserAddress;
import com.thmarket.service.OrderService;
import com.thmarket.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference(loadbalance="random",timeout=1000) //dubbo直连
    UserService userService;

    @HystrixCommand(fallbackMethod="initOrderFallback")
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id：" + userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }

    public List<UserAddress> initOrderFallback(String userId) {
        return Arrays.asList(new UserAddress(10, "测试地址", "1", "测试", "测试", "Y"));
    }
}
