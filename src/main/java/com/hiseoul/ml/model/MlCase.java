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
@Table(name="tb_ml_case")
@Getter
@Setter
@ToString
public class MlCase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String ml_case_uuid;
	private String ml_case_name;
	private String ml_case_type;
	private String ml_case_count;
	private String ml_case_pre_count;
	private String ml_case_region_uuid;
	private String ml_case_cctv_uuid;
	private String ml_case_biz_model_uuid;
	private String ml_case_number;
	private String ml_case_use_yn;
	private Timestamp ml_case_write_date;
	private Timestamp ml_case_update_date;
	
	public String getMlCase_uuid() {
		return ml_case_uuid;
	}
	
	public void setMlCase_uuid(String uuid) {
		this.ml_case_uuid = uuid;
	}
	
	public String getMlCase_name() {
		return ml_case_name;
	}
	
	public void setMlCase_name(String name) {
		this.ml_case_name = name;
	}
	
	public String getMlCase_type() {
		return ml_case_type;
	}
	
	public void setMlCase_type(String type) {
		this.ml_case_type = type;
	}
	
	public String getMlCase_count() {
		return ml_case_count;
	}
	
	public void setMlCase_count(String count) {
		this.ml_case_count = count;
	}
	
	public String getMlCase_pre_count() {
		return ml_case_pre_count;
	}
	
	public void setMlCase_pre_count(String pre_count) {
		this.ml_case_pre_count = pre_count;
	}
	
	public String getMlCase_region_uuid() {
		return ml_case_region_uuid;
	}
	
	public void setMlCase_region_uuid(String region_uuid) {
		this.ml_case_region_uuid = region_uuid;
	}
	
	public String getMlCase_cctv_uuid() {
		return ml_case_cctv_uuid;
	}
	
	public void setMlCase_cctv_uuid(String cctv_uuid) {
		this.ml_case_cctv_uuid = cctv_uuid;
	}
	
	public String getMlCase_biz_model_uuid() {
		return ml_case_biz_model_uuid;
	}
	
	public void setMlCase_biz_model_uuid(String biz_model_uuid) {
		this.ml_case_biz_model_uuid = biz_model_uuid;
	}
	
	public String getMlCase_number() {
		return ml_case_number;
	}
	
	public void setMlCase_number(String number) {
		this.ml_case_number = number;
	}
	
	public String getMlCase_use_yn() {
		return ml_case_use_yn;
	}
	
	public void setMlCase_use_yn(String use_yn) {
		this.ml_case_use_yn = use_yn;
	}
	
	public Timestamp getMlCase_write_date() {
		return ml_case_write_date;
	}
	
	public void setMlCase_write_date(Timestamp write_date) {
		this.ml_case_write_date = write_date;
	}
	
	public Timestamp getMlCase_update_date() {
		return ml_case_update_date;
	}
	
	public void setMlCase_update_date(Timestamp update_date) {
		this.ml_case_update_date = update_date;
	}
}