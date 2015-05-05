package com.zyr.dubbo.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyr.dubbo.common.domain.Java8Time;
import com.zyr.dubbo.common.service.Java8TimeService;

@Controller
public class Java8TimeController {

	@Resource(name = "java8TimeService")
	private Java8TimeService java8TimeService;
	
	@RequestMapping("/queryJava8Time")
	@ResponseBody
	public String queryJava8Time() {
		
		Java8Time java8Time = new Java8Time();

		Java8Time result = java8TimeService.queryJava8Time(java8Time ); 
		
		return result.toString();
	}
}
