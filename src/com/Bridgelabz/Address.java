package com.Bridgelabz;

public class Address 
{
	public String city;
	public String state;
	public long zip;

	public Address(String city, String state, long zip) {
		super();
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
}
