package com.Bridgelabz;

public interface IAddressBook
{
	void  addContact();
	void editContact(String name) ;
	void deleteContact(String name);
	 void addMultipleContacts();
	void Address(String city, String state, long zip);
}
