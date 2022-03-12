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
@Table(name="tb_cctv_info")
@Getter
@Setter
@ToString
public class CctvInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "cctv_uuid")
	String cctvUuid;
	
	private String cctv_name;
	private String cctv_type;
	private String cctv_model;
	private String cctv_product_company;
	private String cctv_resolution;
	private String cctv_marker;
	private Timestamp cctv_write_date;
	private Timestamp cctv_update_date;
	private String cctv_use_yn;
	private String cctv_active_status;
	
	
	
	
	public String getCctvUuid() {
		return cctvUuid;
	}
	
	public void setCctvUuid(String cctvUuid) {
		this.cctvUuid = cctvUuid;
	}
	
	public String getCctvName() {
		return cctv_name;
	}
	
	public void setCctvName(String name) {
		this.cctv_name = name;
	}
	
	public String getCctvType() {
		return cctv_type;
	}
	
	public void setCctvType(String type) {
		this.cctv_type = type;
	}
	
	public String getCctvModel() {
		return cctv_model;
	}
	
	public void setCctvModel(String model) {
		this.cctv_model = model;
	}
	
	public String getCctvProductcompany() {
		return cctv_product_company;
	}
	
	public void setCctvProductcompany(String product_company) {
		this.cctv_product_company = product_company;
	}
	
	public String getCctvResolution() {
		return cctv_resolution;
	}
	
	public void setCctvResolution(String resolution) {
		this.cctv_resolution = resolution;
	}
	
	public String getCctvMarker() {
		return cctv_marker;
	}
	
	public void setCctvMarker(String marker) {
		this.cctv_marker = marker;
	}
	
	public Timestamp getCctvWriteDate() {
		return cctv_write_date;
	}
	
	public void setCctvWriteDate(Timestamp writedate) {
		this.cctv_write_date = writedate;
	}
	
	public Timestamp getCctvUpdateDate() {
		return cctv_update_date;
	}
	
	public void setCctvUpdateDate(Timestamp updatedate) {
		this.cctv_update_date = updatedate;
	}
	
	public String getCctv_use_yn() {
		return cctv_use_yn;
	}
	
	public void setCctv_use_yn(String use_yn) {
		this.cctv_use_yn = use_yn;
	}
	
	public String getCctv_active_status() {
		return cctv_active_status;
	}
	
	public void setCctv_active_status(String active_status) {
		this.cctv_active_status = active_status;
	}
	
}