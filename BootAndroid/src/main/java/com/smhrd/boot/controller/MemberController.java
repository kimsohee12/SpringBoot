package com.smhrd.boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smhrd.boot.model.AndMember;
import com.smhrd.boot.service.MemberService;

@RestController
public class MemberController {
	
	@Autowired
	private MemberService service;
	//localhost:8089/join
	@PostMapping("/join")
	public String join(HttpServletRequest request) throws JsonMappingException, JsonProcessingException {
		String andMember = request.getParameter("AndMember");
		
		ObjectMapper om = new ObjectMapper(); //jaxkson-databind 에서 제공
		AndMember am = om.readValue(andMember, AndMember.class);
		
		AndMember result = service.join(am);
		if(result!=null) {
			return "Success";
		}else {
			return "Fail";
		}
	}
	@PostMapping("/login")
	public String login(HttpServletRequest request) throws JsonMappingException, JsonProcessingException {
		String andMember = request.getParameter("AndMember");
		ObjectMapper om = new ObjectMapper();
		AndMember am = om.readValue(andMember, AndMember.class);
		
		//Request 되면 Controller(요청,응답) 로 넘어옴 -> Service(요청과 응답사이의 로직 처리)
		//Mybatis : -> mapper
		//JPA	  : -> Repository (Interface)
		AndMember result =  service.login(am);
		
		//AndMember 가 있는값을 입력했는지 없는값을 입력했는지 확인-> 로그인 성공/로그인 x.
		System.out.println(result);
		if(result!=null) {
			return "Success";
			
		}else {
			return "Fail";
		}
		
	}
	
}
