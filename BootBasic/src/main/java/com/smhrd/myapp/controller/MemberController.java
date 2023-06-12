package com.smhrd.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.myapp.domain.Member;
import com.smhrd.myapp.service.MemberService;
//@Controller + @ResponseBody
//데이터(모델)을 반환해주는 컨트롤러 지정
@RestController
public class MemberController {
   @Autowired
   private MemberService service;
   //Spring 기본 순서
   //(요청 처리)Controller -> Service(class) -> mapper Interface -> mapper XML
   //(결과 처리)mapper XML -> mapper Interface -> Service -> Controller
   //controller : 요청 받는거 , 응답 하는거 에 집중
   //service : 데이터 가공, 요청 가공에 집중(로직)
   @GetMapping("/member")
   public List<Member> memberList(){
	   //List<Member>  반환
	   //->JAVA
	   //jackson libray(boot 기본내장)
	   //java object -> json
	   //
      return service.memberList();
   }
}