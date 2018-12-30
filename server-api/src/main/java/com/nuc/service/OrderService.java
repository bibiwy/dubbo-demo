package com.nuc.service;

import java.util.List;

import bean.User;

// OrderService 是订阅者接口，订阅 UserService
public interface OrderService {
	public List<User> initOrderService();
}
