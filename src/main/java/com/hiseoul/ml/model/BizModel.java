package com.hiseoul.ml.model;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tb_biz_model")
@Getter
@Setter
@ToString
public class BizModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String biz_model_uuid;
	private String biz_model_name;
	private String biz_model_type;
	private String biz_model_contents;
	private Timestamp biz_model_write_date;
	private Timestamp biz_model_update_date;
	private String biz_model_use_yn;
	
	public String getBizModel_uuid() {
		return biz_model_uuid;
	}
	
	public void setBizModel_uuid(String uuid) {
		this.biz_model_uuid = uuid;
	}
	
	public String getBizModel_name() {
		return biz_model_name;
	}
	
	public void setBizModel_name(String name) {
		this.biz_model_name = name;
	}
	
	public String getBizModel_type() {
		return biz_model_type;
	}
	
	public void setBizModel_type(String type) {
		this.biz_model_type = type;
	}
	
	public String getBizModel_contents() {
		return biz_model_contents;
	}
	
	public void setBizModel_contents(String contents) {
		this.biz_model_contents = contents;
	}
	
	public Timestamp getBizModel_write_date() {
		return biz_model_write_date;
	}
	
	public void setBizModel_write_date(Timestamp write_date) {
		this.biz_model_write_date = write_date;
	}
	
	public Timestamp getBizModel_update_date() {
		return biz_model_update_date;
	}
	
	public void setBizModel_update_date(Timestamp update_date) {
		this.biz_model_update_date = update_date;
	}
	
	public String getBizModel_use_yn() {
		return biz_model_use_yn;
	}
	
	public void setBizModel_use_yn(String use_yn) {
		this.biz_model_use_yn = use_yn;
	}
}