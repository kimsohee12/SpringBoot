package com.smhrd.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smhrd.boot.model.AndMember;

@Repository
public interface MemberRepository extends JpaRepository<AndMember, Integer>{
   
	//select * from andmember2 where id=? and pw=?  ==  findByIdAndPw
	AndMember findByIdAndPw(@Param("id")String id, @Param("pw")String pw); //@Param("id")String id, -> 테이블에 컬럼아이디와 넘어오는 값과 같은지 확인
	
}