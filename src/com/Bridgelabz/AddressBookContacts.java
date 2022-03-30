package com.Bridgelabz;

public class AddressBookContacts
{
	 private String FirstName;
	  private String LastName;
	  private String Address;
	  private String City;
	  private String State;
	  private long Zip;
	  private long PhoneNumber;
	  private String Email;
	
	

	
public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public long getZip() {
		return Zip;
	}
	public void setZip(long zip) {
		Zip = zip;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public AddressBookContacts(String firstName, String lastName, String address, String city, String state, long zip,
			long phoneNumber, String email) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Address = address;
		this.City = city;
		this.State = state;
		this.Zip = zip;
		this.PhoneNumber = phoneNumber;
		this.Email = email;
	}
	public AddressBookContacts() {
		// TODO Auto-generated constructor stub
	}
	
}
