package com.nuc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nuc.service.OrderService;
import com.nuc.service.UserService;

import bean.User;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@ResponseBody
	@RequestMapping("/init")
	public List<User> initController() {
		System.out.println("访问到了");
		List<User> initOrderService = orderService.initOrderService();
		return initOrderService;
	}
}
