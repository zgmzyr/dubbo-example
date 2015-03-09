package com.zyr.dubbo.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyr.dubbo.common.domain.User;
import com.zyr.dubbo.common.service.UserReadService;

@Controller
public class UserController {
	
	@Resource(name = "userReadServiceClient")
	private UserReadService userReadService;
	
	@RequestMapping("user/queryUserById")
	@ResponseBody
	public String queryUserById(int id) {
		User user = userReadService.queryUserById(id);
		
		return user.getName();
	}

}
