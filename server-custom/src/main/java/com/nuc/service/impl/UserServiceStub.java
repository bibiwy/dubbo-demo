package com.nuc.service.impl;

import java.util.List;

import org.springframework.util.StringUtils;

import com.nuc.service.UserService;

import bean.User;

/*
 *   1��ʵ��Զ�̵Ľӿ�
 *   2��˽�нӿ�
 *   3���������췽��
 *   4����Ԥ����
 */
public class UserServiceStub implements UserService {
	
	private final UserService userService;
	
	public UserServiceStub(UserService userService){
		this.userService = userService;
	}
	@Override
	public List<User> getUserList() {
		/*
		 	1����������������жϣ���������֮����������
		 	2����Ҫһ�������ǵ���Զ�̵Ľӿڡ���������֮����ȥ����Զ�̵Ľӿ�
		 	eg:
		 	   ����Ϊnull���򲻷��ؼ��ϣ�����null�򷵻�null
		*/	
		if(!StringUtils.isEmpty(null)) {
			return userService.getUserList();
		}
		return null;
	}
}
