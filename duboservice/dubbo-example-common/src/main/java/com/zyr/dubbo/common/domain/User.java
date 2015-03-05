package com.zyr.dubbo.common.domain;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 6923829726814817763L;
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
