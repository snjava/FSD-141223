package com.institute.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "stud_details")
public class StudentInfo {
	//@SequenceGenerator(name = "seq_name", initialValue = 1, allocationSize = 1)
	//@GeneratedValue(generator = "seq_name", strategy = GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT functionality of DB
	@Id
	private int sid;
	@Column(name = "stud_name", length = 30, nullable = false)
	private String name;
	@Column(unique = true, length = 10)
	private String contact;
	private String city;
	
	@Transient
	private int age;
	
	@CreationTimestamp
	@Column(name = "crte_ts")
	private LocalDateTime createdDateTime;
	
	@UpdateTimestamp
	@Column(name = "updt_ts")
	private LocalDateTime updatedDateTime;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public LocalDateTime getUpdatedDateTime() {
		return updatedDateTime;
	}
	public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
