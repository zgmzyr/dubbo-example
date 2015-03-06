package com.zyr.dubbo.client;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zyr.dubbo.common.domain.User;
import com.zyr.dubbo.common.service.UserReadService;

@Service("userReadServiceClient")
public class UserReadServiceClient implements UserReadService {
	
	@Resource(name = "userReadService")
	private UserReadService userReadService;

	public User queryUserById(int id) {
		return userReadService.queryUserById(1);
	}

	public User queryUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
