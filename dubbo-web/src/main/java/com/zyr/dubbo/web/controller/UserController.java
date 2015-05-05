package com.zyr.dubbo.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyr.dubbo.common.domain.User;
import com.zyr.dubbo.common.service.UserReadService;

@Controller
public class UserController {
	
//	@Resource(name = "userReadServiceClient")
	@Resource(name = "userReadService")
	private UserReadService userReadService;
	
	@RequestMapping("user/queryUserById")
	@ResponseBody
	public String queryUserById(int id) {
		User user = userReadService.queryUserById(id);
		
		return user.getName();
	}
	
	@RequestMapping("user/queryUserByName")
	@ResponseBody
	public String queryUserByName(String name) {
		User user = userReadService.queryUserByName(name);
		
		return user.getName();
	}

}
