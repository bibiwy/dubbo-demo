package com.nuc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuc.service.OrderService;
import com.nuc.service.UserService;

import bean.User;


@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	UserService userService;
	
	@Override
	public List<User> initOrderService( ) {
			List<User> userList = userService.getUserList();
			return userList;
	}
}
