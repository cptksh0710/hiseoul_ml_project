package com.hiseoul.ml.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tb_menu_cate")
@Getter
@Setter
@ToString
public class MenuCate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="cate_no")
	private Integer cateNo;
	
	private String menu_name;
	private Integer menu_perm;
	private Integer parant_no;
	private String uri;
	private String menu_use_yn;
	private Timestamp write_date;
	private Timestamp update_date;
	
	public Integer getCateNo() {
		return cateNo;
	}
	
	public void setCateNo(Integer cateno) {
		this.cateNo = cateno;
	}
	
	public String getmenucateName() {
		return menu_name;
	}
	
	public void setmenucateName(String catename) {
		this.menu_name = catename;
	}
	
	public Integer getmenucatePerm() {
		return menu_perm;
	}
	
	public void setmenucatePerm(Integer cateperm) {
		this.menu_perm = cateperm;
	}
	
	public Integer getmenucateparantNo() {
		return parant_no;
	}
	
	public void setmenucateparantNo(Integer parantno) {
		this.parant_no = parantno;
	}
	
	public String getmenucateUri() {
		return uri;
	}
	
	public void setmenucateUri(String cateuri) {
		this.uri = cateuri;
	}
	
	public String getmenucateUseyn() {
		return menu_use_yn;
	}
	
	public void setmenucateUseyn(String cateuseyn) {
		this.menu_use_yn = cateuseyn;
	}
	
	public Timestamp getmenucateWritedate() {
		return write_date;
	}
	
	public void setmenucateWritedate(Timestamp writedate) {
		this.write_date = writedate;
	}
	
	public Timestamp getmenucateUpdatedate() {
		return update_date;
	}
	
	public void setmenucateUpdatedate(Timestamp updatedate) {
		this.update_date = updatedate;
	}
}