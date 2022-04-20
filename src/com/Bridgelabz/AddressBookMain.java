package com.Bridgelabz;

import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To Address Book Program!!!!!");
		IAddressBook addressBook=new AddressBook();
		
		addressBook.addContact();

		System.out.println("Enter name of person you wish to edit");
		String name = sc.next();
		addressBook.editContact(name);

		System.out.println("Enter name of person you wish to delete");
		String deletePerson = sc.next();
		addressBook.deleteContact(deletePerson);
		System.out.println("Address Book contains: \n" + addressBook);
		addressBook.addMultipleContacts();
		System.out.println(addressBook);

		AddressBookDictionary addressBookDictionary = new AddressBookDictionary();
		addressBookDictionary.addMultipleAddressBook();
		addressBookDictionary.printAddressBookDictionary();
		System.out.println("enter the place to be search");
		String place=sc.next();
		addressBookDictionary.searchPersonInCityOrState(place);
		addressBookDictionary.viewPersonByCityOrState(place);
		
		
	}
}

