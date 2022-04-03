package com.Bridgelabz;



public class AddressBookContacts
{
	String name;
	public Address address;
	public long phoneNumber;
	public String email;
	

	public AddressBookContacts(String name, String city, String state, long zip,long phoneNumber, String email) {
		super();
		this.name = name;
		this.address = new Address(city, state, zip);
		this.phoneNumber = phoneNumber;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Name: " +name + "\n address: " + address
				+ "\n Phone: " + phoneNumber + "\n Email: " + email;
	}
	
	
	
}
