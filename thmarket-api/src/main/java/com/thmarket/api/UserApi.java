package com.thmarket.api;

import com.thmarket.service.OrderService;
import com.thmarket.model.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserApi {

    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/user/{id}/order")
    public List<UserAddress> initOrder(@PathVariable("id") String userId) {
        return orderService.initOrder(userId);
    }
}
