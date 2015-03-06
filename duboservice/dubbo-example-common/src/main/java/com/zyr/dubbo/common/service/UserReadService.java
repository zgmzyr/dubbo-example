package com.zyr.dubbo.common.service;

import com.zyr.dubbo.common.domain.User;

public interface UserReadService {
	
	public User queryUserById(int id);

	public User queryUserByName(String name);
}
