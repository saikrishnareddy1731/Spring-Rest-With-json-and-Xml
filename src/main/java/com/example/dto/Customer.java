package com.example.dto;

import javax.xml.bind.annotation.XmlElement;//jax-B api***************** objective
import javax.xml.bind.annotation.XmlRootElement;
//for xml output
//@XmlRootElement
public class Customer {
	private int id;
	private String name;
	private String Address;
	
//	@XmlElement
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	@XmlElement
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	

}
