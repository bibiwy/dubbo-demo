package com.nuc.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.nuc.service.UserService;

import bean.User;

// UserServiceImpl 实现      UserService 在server-api 中
public class UserServiceImpl02 implements UserService {

	@Override
	public List<User> getUserList( ) {
		User user = null;
		List<User> list = new ArrayList<User>();
		for(int i=0;i<100;i++) {
			user = new User();
			user.setuPassword("这个是version_2");
			list.add(user);
		}
		System.out.println("这个是version_2");
		return list;
	}
}
