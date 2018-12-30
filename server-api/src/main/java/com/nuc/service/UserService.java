package com.nuc.service;

import java.util.List;

import bean.User;

// UserService 是提供接口，供订阅者调用
public interface UserService {
	public List<User> getUserList();
}
