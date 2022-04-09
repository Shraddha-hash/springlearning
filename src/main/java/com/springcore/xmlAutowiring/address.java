package com.springcore.xmlAutowiring;

public class address {
	private String street,city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "address [street=" + street + ", city=" + city + "]";
	}

	public void setCity(String city) {
		this.city = city;
	}
}
