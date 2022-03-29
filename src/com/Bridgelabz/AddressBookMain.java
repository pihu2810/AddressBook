package com.Bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
	private static List<AddressBookContacts> contactList = new ArrayList<AddressBookContacts>();

	public static void addContact(String FirstName, String LastName, String Address, String City, long Zip,
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

	public static void printContact() {
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

	public static void editContactDetails(String name, long newPhoneNumber) {
		
		for (int i = 0; i < contactList.size(); i++) {
			
			if (contactList.get(i).getFirstName().equals(name)) {
				System.out.println("From If loop");
				contactList.get(i).setPhoneNumber(newPhoneNumber);
			}
		}
	}

	public static void main(String args[]) {
		System.out.println("Welcome to Address Book Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of person in AddressBook");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter FirstName");
			String FirstName = sc.next();
			System.out.println("Enter LastName");
			String LastName = sc.next();
			System.out.println("Enter Address");
			String Address = sc.next();
			System.out.println("Enter City");
			String City = sc.next();
			System.out.println("Enter Zip");
			long Zip = sc.nextLong();
			System.out.println("Enter PhoneNumber");
			long PhoneNumber = sc.nextLong();
			System.out.println("Enter Email");
			String Email = sc.next();

			addContact(FirstName, LastName, Address, City, Zip, PhoneNumber, Email);
		}
		printContact();
		System.out.println("Enter the first name of the user for which details needs to be updated: ");
		String searchName = sc.next();
		System.out.println("Enter the new details for " + searchName);
		System.out.println("Enter phone number");
		long newPhoneNumber = sc.nextLong();
		editContactDetails(searchName, newPhoneNumber);
		 System.out.println("Updated contact details are : ");
		printContact();

	}
}
