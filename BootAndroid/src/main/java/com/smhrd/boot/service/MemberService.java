package com.smhrd.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.boot.model.AndMember;
import com.smhrd.boot.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository repository;
	
	public AndMember join(AndMember am) {
		//insert
		return repository.save(am); // save -> 부모클래스안에있는 메서드 (insert 와 같은 역할)
	}
	
	public AndMember login(AndMember am) {
		//JPA 에서 select (where id =? and pw =?) 하는 방식 다른 find All -> select * -> 조건을 끼면 findBy
		return repository.findByIdAndPw(am.getId(),am.getPw());
	}
}
