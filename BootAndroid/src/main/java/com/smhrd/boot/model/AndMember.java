package com.smhrd.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity // JPA 관리하는 어노테이션
@Table(name ="andmember2") // 생성되는 테이블 이름 (매핑할 테이블 이름)
@Data
public class AndMember {
	@Id //primaryKey 지정하는 어노테이션
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="m_idx") //컬럼 이름 지정
	private int mIdx; //member 식별자
	
	@Column(name = "id",length =50)
	private String id;
	@Column(name = "pw",length =50)
	private String pw;
	@Column(name = "tel",length =50)
	private String tel;
	@Column(name = "birth",length =50)
	private String birth;
	

}
