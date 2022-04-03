package com.Bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("Welcome To Address Book Program!!!!!");
		AddressBook iaddressBook = new AddressBook();
		iaddressBook.addContact();

		System.out.println("Enter name of person you wish to edit");
		String name = scanner.next();
		iaddressBook.editContact(name);

		System.out.println("Enter name of person you wish to delete");
		String deletePerson = scanner.next();
		iaddressBook.deleteContact(deletePerson);
		System.out.println("Address Book contains: \n" + iaddressBook.addressBook);

		iaddressBook.addMultipleContacts();
		System.out.println(iaddressBook.addressBook);
	}

}
