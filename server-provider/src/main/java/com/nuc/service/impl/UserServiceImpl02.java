package com.nuc.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.nuc.service.UserService;

import bean.User;

// UserServiceImpl ʵ��      UserService ��server-api ��
public class UserServiceImpl02 implements UserService {

	@Override
	public List<User> getUserList( ) {
		User user = null;
		List<User> list = new ArrayList<User>();
		for(int i=0;i<100;i++) {
			user = new User();
			user.setuPassword("�����version_2");
			list.add(user);
		}
		System.out.println("�����version_2");
		return list;
	}
}
