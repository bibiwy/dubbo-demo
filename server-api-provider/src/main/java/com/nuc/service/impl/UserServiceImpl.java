package com.nuc.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.nuc.service.UserService;
import bean.User;

@Service // 暴露接口
@Component
public class UserServiceImpl implements UserService {

	@Override
	public List<User> getUserList() {
		User user = null;
		List<User> list = new ArrayList<User>();
		for(int i=0;i<5;i++) {
			user = new User();
			user.setAge(""+i);
			user.setuName(""+i);
			user.setuPassword(""+i+"2"+i);
			list.add(user);
		}
		
		// 大于2.5则出现异常
		if(Math.random() > 2.5) {
			throw new RuntimeException();
		}
		
		return list;
	}
}
