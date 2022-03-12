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
@Table(name="tb_region")
@Getter
@Setter
@ToString
public class Region {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String region_uuid;
	private String region_name;
	private String region_type;
	private String region_address;
	private String region_post_code;
	private String region_latitude;
	private String region_longitude;
	private String region_nation;
	private String region_nation_code;
	private Timestamp region_write_date;
	private Timestamp region_update_date;
	private String region_use_yn;
	
	public String getRegion_uuid() {
		return region_uuid;
	}
	
	public void setRegion_uuid(String uuid) {
		this.region_uuid = uuid;
	}
	
	public String getRegion_name() {
		return region_name;
	}
	
	public void setRegion_name(String name) {
		this.region_name = name;
	}
	
	public String getRegion_type() {
		return region_type;
	}
	
	public void setRegion_type(String type) {
		this.region_type = type;
	}
	
	public String getRegion_address() {
		return region_address;
	}
	
	public void setRegion_address(String address) {
		this.region_address = address;
	}
	
	public String getRegion_post_code() {
		return region_post_code;
	}
	
	public void setRegion_post_code(String post_code) {
		this.region_post_code = post_code;
	}
	
	public String getRegion_latitude() {
		return region_latitude;
	}
	
	public void setRegion_latitude(String latitude) {
		this.region_latitude = latitude;
	}
	
	public String getRegion_longitude() {
		return region_longitude;
	}
	
	public void setRegion_longitude(String longitude) {
		this.region_longitude = longitude;
	}
	
	public String getRegion_nation() {
		return region_nation;
	}
	
	public void setRegion_nation(String nation) {
		this.region_nation = nation;
	}
	
	public String getRegion_nation_code() {
		return region_nation_code;
	}
	
	public void setRegion_nation_code(String nation_code) {
		this.region_nation_code = nation_code;
	}
	
	public Timestamp getRegion_write_date() {
		return region_write_date;
	}
	
	public void setRegion_write_date(Timestamp write_date) {
		this.region_write_date = write_date;
	}
	
	public Timestamp getRegion_update_date() {
		return region_update_date;
	}
	
	public void setRegion_update_date(Timestamp update_date) {
		this.region_update_date = update_date;
	}
	
	public String getRegion_use_yn() {
		return region_use_yn;
	}
	
	public void setRegion_use_yn(String use_yn) {
		this.region_use_yn = use_yn;
	}
}