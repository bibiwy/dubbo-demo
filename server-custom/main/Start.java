package com.nuc.main;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.OrderService;

public class Start {
	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("customer.xml");
		OrderService orderService = ioc.getBean(OrderService.class);
		orderService.initOrderService(1);
		
		System.in.read();
		
	}
}
