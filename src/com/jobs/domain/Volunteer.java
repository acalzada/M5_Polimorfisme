package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	String description;
	
	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		
		if (description == null) throw new Exception("Missing description field.");
		
		this.description = description;
	}

	
	@Override
	public void pay() {
		System.out.println("\t- " + this.getName() + " Sorry you have no salary.");
		
	}

}
