package com.zyr.dubbo.server.service;

import org.springframework.stereotype.Service;

import com.zyr.dubbo.common.domain.User;
import com.zyr.dubbo.common.service.UserReadService;

@Service("userReadService")
public class UserReadServiceImpl implements UserReadService {

	public User queryUserById(int id) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setAge(20);
		user.setId(1);
		user.setName("zyr");
		
		return user;
	}

	public User queryUserByName(String name) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setAge(20);
		user.setId(1);
		user.setName("zyr");
		
		return user;
	}

}
