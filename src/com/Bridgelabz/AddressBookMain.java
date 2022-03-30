package com.Bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String args[]) {
		System.out.println("Welcome to Address Book Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of person in AddressBook");
		int n = sc.nextInt();
		IAddressBook iAddressBook=new AddressBook();
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
       
		iAddressBook.addContact(FirstName, LastName, Address, City, Zip, PhoneNumber, Email);
		}
		iAddressBook.printContact();
		System.out.println("Enter the first name of the user for which details needs to be updated: ");
		String searchName = sc.next();
		System.out.println("Enter the new details for " + searchName);
		System.out.println("Enter phone number");
		long newPhoneNumber = sc.nextLong();
		iAddressBook.editContactDetails(searchName, newPhoneNumber);
		 System.out.println("Updated contact details are : ");
		 
	    iAddressBook.printContact();
		Scanner scanner=new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Enter the name for delete " +name);
		iAddressBook.deleteContactDetails(name);
		System.out.println("Successfully Deleted");
		System.out.println("Updated contact list details afterw deleted : ");
		iAddressBook.printContact();
	}
}
