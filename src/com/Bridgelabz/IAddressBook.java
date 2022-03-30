package com.Bridgelabz;

public interface IAddressBook
{
	void addContact(String FirstName, String LastName, String Address, String City, long Zip,
			long PhoneNumber, String Email);
	void printContact();
	void editContactDetails(String name, long newPhoneNumber);
	void deleteContactDetails(String name);
}
