package com.hiseoul.ml.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tb_member")
@Getter
@Setter
@ToString
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "no")
	Integer memberNo;
	private String id;
	private String pass;
	private String name;
	private String email;
	private String instance_yn;
	private Timestamp write_date;
	private Timestamp update_date;
	private String active_yn;
	private Integer permission;
	private Integer auth;
	
	public Integer getMemberNo() {
		return memberNo;
	}
	
	public void setMemberNo(Integer memberno) {
		this.memberNo = memberno;
	}
	
	public String getmemberId() {
		return id;
	}
	
	public void setmemberId(String id) {
		this.id = id;
	}
	
	public String getmemberPass() {
		return pass;
	}
	
	public void setmemberPass(String pass) {
		this.pass = pass;
	}
	
	public String getmemberName() {
		return name;
	}
	
	public void setmemberName(String name) {
		this.name = name;
	}
	
	public String getmemberEmail() {
		return email;
	}
	
	public void setmemberEmail(String email) {
		this.email = email;
	}
	
	public String getmemberinstanceYn() {
		return instance_yn;
	}
	
	public void setmemberInstanceyn(String instanceyn) {
		this.instance_yn = instanceyn;
	}
	
	public Timestamp getmemberWritedate() {
		return write_date;
	}
	
	public void setmemberWritedate(Timestamp writedate) {
		this.write_date = writedate;
	}
	
	public Timestamp getmemberUpdatedate() {
		return update_date;
	}
	
	public void setmemberUpdatedate(Timestamp updatedate) {
		this.update_date = updatedate;
	}
	
	public String getmemberactiveYn() {
		return active_yn;
	}
	
	public void setmemberactiveYn(String activeyn) {
		this.active_yn = activeyn;
	}
	
	public Integer getmemberPermission() {
		return permission;
	}
	
	public void setmemberPermission(Integer permission) {
		this.permission = permission;
	}
	
	public Integer getmemberAuth() {
		return auth;
	}
	
	public void setmemberAuth(Integer auth) {
		this.auth = auth;
	}
}