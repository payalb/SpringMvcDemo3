package com.java.dto;

import lombok.Data;

@Data
public class Student {
	public Student() {
		count++;
		id=count;
	}
	static int count;
	int id;
	String name;
	String address;
	long phNo;
}
