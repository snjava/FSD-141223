package com.institute.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserAddress {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int aid;
	private String city;
	private String pin;
	private String state;
	@OneToOne
	@JoinColumn(name = "uid")
	private UserDetails userDtls;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public UserDetails getUserDtls() {
		return userDtls;
	}

	public void setUserDtls(UserDetails userDtls) {
		this.userDtls = userDtls;
	}
}
