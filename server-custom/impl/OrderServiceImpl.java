package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import bean.User;
import service.OrderService;
import service.UserService;

@Service
public class OrderServiceImpl implements OrderService {

/*
 *  1、将服务提供这注册到注册中心（暴露服务）
 *     1）导入dubbo的依赖    zookeeper客户端
 *  2、让服务消费者去注册中心订阅提供者的服务地址 
 * 
 */
	@Autowired
	UserService userService;
	@Override
	public void initOrderService(Integer id) {
			List<User> userList = userService.getUserList(id);
			for (User user : userList) {
				System.out.println(user);
			}
	}
	

}
