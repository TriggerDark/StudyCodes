package com.demo.user;

public class User {
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "city=[" + city + "]";
	}
	
}
