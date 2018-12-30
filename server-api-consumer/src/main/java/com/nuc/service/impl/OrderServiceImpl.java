package com.nuc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.nuc.service.OrderService;
import com.nuc.service.UserService;

import bean.User;

// spring的注入
@Service 
public class OrderServiceImpl implements OrderService {
	
	// 负载均衡方式
	// roundrobin 
	// leastactive
	// random  默认的方式
	@Reference(loadbalance="leastactive")
	UserService userService;
	
	@Override
	public List<User> initOrderService() {
			List<User> userList = userService.getUserList();
			return userList;
	}
	
}
