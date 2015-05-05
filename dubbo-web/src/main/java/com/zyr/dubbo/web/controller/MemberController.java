package com.zyr.dubbo.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aicai.appmodel.domain.result.ModelResult;
import com.aicai.member.common.domain.option.MemberQueryOption;
import com.aicai.member.common.service.MemberReadService;
import com.aicaipiao.common.entity.member.Member;

@Controller
public class MemberController {
	
	@Resource(name = "memberReadServiceClient")
	private MemberReadService memberReadServiceClient;
	
	
	@RequestMapping("member/queryMemberById")
	@ResponseBody
	public String  queryMemberById() {
		ModelResult<Member> memberResult = memberReadServiceClient.queryMemberById(281157, new MemberQueryOption()); 
		if (memberResult.isSuccess()) {
			return memberResult.getModel().getName();
		}
		
		return null;
	}
	

}
