package com.skillsoft.model;

import java.io.Serializable;

public class Student implements Serializable{
	
private static final int serialVersionUID = 1;
	
	private int id;
	
	private String firstName;
	private String lastName;
	private String major;
	
	public Student(String firstName, String lastName, String major) {
		super();
		this.id = (int) Math.floor(Math.random() * 1000000);
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", major=" + major + "]";
	}

	

}
