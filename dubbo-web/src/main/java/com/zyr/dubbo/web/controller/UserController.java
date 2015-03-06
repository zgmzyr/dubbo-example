package com.zyr.dubbo.web.controller;

import org.springframework.stereotype.Controller;

import com.zyr.dubbo.common.service.UserReadService;

@Controller
public class UserController {
	
	@Resource(name = "userReadServiceClient")
	private UserReadService userReadService;

}
