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
@Table(name="tb_auth")
@Getter
@Setter
@ToString
public class Auth {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "auth_uuid")
	String authUuid;
	
	private String user_id;
	private String token;
	private String real_ip;
	private String browser;
	private String device_type;
	private String use_yn;
	private Timestamp start_date;
	private Timestamp expire_date;
	private String expire_reason;
		
	public String getAuthUuid() {
		return authUuid;
	}
	
	public void setAuthUuid(String authUuid) {
		this.authUuid = authUuid;
	}
	
	public String getUserId() {
		return user_id;
	}
	
	public void setUserId(String user_id) {
		this.user_id = user_id;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getRealIP() {
		return real_ip;
	}
	
	public void setRealIP(String real_ip) {
		this.real_ip = real_ip;
	}
	
	public String getBrowser() {
		return browser;
	}
	
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	
	public String getDeviceType() {
		return device_type;
	}
	
	public void setDeviceType(String device_type) {
		this.device_type = device_type;
	}
	
	public String getUseyn() {
		return use_yn;
	}
	
	public void setUseyn(String use_yn) {
		this.use_yn = use_yn;
	}
	
	public Timestamp getStartDate() {
		return start_date;
	}
	
	public void setStartDate(Timestamp start_date) {
		this.start_date = start_date;
	}
	
	public Timestamp getExpireDate() {
		return expire_date;
	}
	
	public void setExpireDate(Timestamp expire_date) {
		this.expire_date = expire_date;
	}
	
	public String getExpireReason() {
		return expire_reason;
	}
	
	public void setExpireReason(String expire_reason) {
		this.expire_reason = expire_reason;
	}
	
}