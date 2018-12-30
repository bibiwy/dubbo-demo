package com.nuc.main;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nuc.service.OrderService;
import com.nuc.service.impl.OrderServiceImpl;

import bean.User;

public class Start {
	//@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("customer.xml");
		OrderService orderService = ioc.getBean(OrderService.class);
		List<User> initOrderService = orderService.initOrderService();
		System.out.println(initOrderService);
		
		//OrderServiceImpl orderServiceImpl = (OrderServiceImpl) ioc.getBean("orderServiceImpl");
		//orderServiceImpl.initOrderService(1);
		System.in.read();
		
	}
}
