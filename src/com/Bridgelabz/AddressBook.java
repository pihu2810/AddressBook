package com.Bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook implements IAddressBook{
	Scanner scannerObject = new Scanner(System.in);
	public List<AddressBookContacts> contactList = new ArrayList<AddressBookContacts>();

	public  void addContact(String FirstName, String LastName, String Address, String City, long Zip,
			long PhoneNumber, String Email) {
		AddressBookContacts addressBookContacts = new AddressBookContacts();
		addressBookContacts.setFirstName(FirstName);
		addressBookContacts.setLastName(LastName);
		addressBookContacts.setAddress(Address);
		addressBookContacts.setCity(City);
		addressBookContacts.setZip(Zip);
		addressBookContacts.setPhoneNumber(PhoneNumber);
		addressBookContacts.setEmail(Email);
		contactList.add(addressBookContacts);

	}

	public  void printContact() {
		System.out.println("********Print Contact*******");
		for (int i = 0; i < contactList.size(); i++) {
			System.out.println("*****Start of user details in Address book**********");
			System.out.println("First name:" + contactList.get(i).getFirstName());
			System.out.println("Lastname:" + contactList.get(i).getLastName());
			System.out.println("Address:" + contactList.get(i).getAddress());
			System.out.println("City:" + contactList.get(i).getCity());
			System.out.println("Zip:" + contactList.get(i).getZip());
			System.out.println("PhoneNumber:" + contactList.get(i).getPhoneNumber());
			System.out.println("Email:" + contactList.get(i).getEmail());

			System.out.println("*****end of user details in Address book**********");
		}
	}

	public void editContactDetails(String name, long newPhoneNumber) {
		
		for (int i = 0; i < contactList.size(); i++) {
			
			if (contactList.get(i).getFirstName().equals(name)) 
			{
				contactList.get(i).setPhoneNumber(newPhoneNumber);
				}else
					System.out.println("invalid name");
		}
	}
	private int haveContact(String name) {
		for (int i = 0; i < contactList.size(); i++) 
			if(contactList.get(i).getFirstName().equals(name)) 
				return i;
			return -1;
		}
	
	public void deleteContactDetails(String name) 
	{
		int place=haveContact(name);
		if(place>=0) {
			contactList.remove(place);
			
		}
		
	}

	}

