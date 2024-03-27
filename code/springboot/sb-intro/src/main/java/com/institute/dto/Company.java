package com.institute.dto;

public class Company {

	private String companyName;
	private String companyLocation;
	
	public Company(String companyName, String companyLocation) {
		this.companyName = companyName;
		this.companyLocation = companyLocation;
		System.out.println("Company Object Created..");
	}
	
	public void printCompanyDetails() {
		System.out.println("Name : " + companyName);
		System.out.println("Location : " + companyLocation);
	}
}
