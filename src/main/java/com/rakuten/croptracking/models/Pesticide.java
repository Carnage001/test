package com.rakuten.croptracking.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pesticide")
public class Pesticide {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pid;
	private String pesticidename;
	private String brand;
	private String dateused;
	private Float quantity;
	private String micronutrients;
	private int cropid;
	public Pesticide() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pesticide(Long pid, String pesticidename, String brand, String dateused, Float quantity,
			String micronutrients, int cropid) {
		super();
		this.pid = pid;
		this.pesticidename = pesticidename;
		this.brand = brand;
		this.dateused = dateused;
		this.quantity = quantity;
		this.micronutrients = micronutrients;
		this.cropid = cropid;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPesticidename() {
		return pesticidename;
	}
	public void setPesticidename(String pesticidename) {
		this.pesticidename = pesticidename;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDateused() {
		return dateused;
	}
	public void setDateused(String dateused) {
		this.dateused = dateused;
	}
	public Float getQuantity() {
		return quantity;
	}
	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}
	public String getMicronutrients() {
		return micronutrients;
	}
	public void setMicronutrients(String micronutrients) {
		this.micronutrients = micronutrients;
	}
	public int getCropid() {
		return cropid;
	}
	public void setCropid(int cropid) {
		this.cropid = cropid;
	}
	
	
	
}
