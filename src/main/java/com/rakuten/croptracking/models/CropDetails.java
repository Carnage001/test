package com.rakuten.croptracking.models;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="CropDetails")
public class CropDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cropid;
	private String fieldName;
	private String cropType;
	private String sowingDate;
	private Long area;
	private long userid;
	
	
	public CropDetails() {
		super();
	}
	
	public int getCropid() {
		return cropid;
	}

	public void setCropid(int cropid) {
		this.cropid = cropid;
	}

	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getCropType() {
		return cropType;
	}
	public void setCropType(String cropType) {
		this.cropType = cropType;
	}
	public String getSowingDate() {
		return sowingDate;
	}
	public void setSowingDate(String sowingDate) {
		this.sowingDate = sowingDate;
	}
	public Long getArea() {
		return area;
	}
	public void setArea(Long area) {
		this.area = area;
	}
	
	
	
	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public CropDetails(int cropid, String fieldName, String cropType, String sowingDate, Long area, Long userid) {
		super();
		this.cropid = cropid;
		this.fieldName = fieldName;
		this.cropType = cropType;
		this.sowingDate = sowingDate;
		this.area = area;
		this.userid = userid;
	}
	
	

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="user_id", nullable = true)
//	private User user;

}
