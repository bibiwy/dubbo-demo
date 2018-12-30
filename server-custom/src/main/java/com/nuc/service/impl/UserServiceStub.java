package com.nuc.service.impl;

import java.util.List;

import org.springframework.util.StringUtils;

import com.nuc.service.UserService;

import bean.User;

/*
 *   1、实现远程的接口
 *   2、私有接口
 *   3、创建构造方法
 *   4、做预处理
 */
public class UserServiceStub implements UserService {
	
	private final UserService userService;
	
	public UserServiceStub(UserService userService){
		this.userService = userService;
	}
	@Override
	public List<User> getUserList() {
		/*
		 	1）这里可以先做个判断，请求来了之后，先做处理。
		 	2）不要一上来就是调用远程的接口。满足条件之后再去调用远程的接口
		 	eg:
		 	   若是为null，则不返回集合，不是null则返回null
		*/	
		if(!StringUtils.isEmpty(null)) {
			return userService.getUserList();
		}
		return null;
	}
}
