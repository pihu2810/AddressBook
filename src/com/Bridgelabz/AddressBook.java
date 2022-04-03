package com.Bridgelabz;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	public static Scanner scanner = new Scanner(System.in);
	public ArrayList<AddressBookContacts> addressBook = new ArrayList<>();
	//public HashMap<Integer, Contact> addressBook = new HashMap<>();
	public void addContact() {
		System.out.println("Enter name");
		String name = scanner.next();
		System.out.println("Enter city");
		String city = scanner.next(); 
		System.out.println("Enter state ");
		String state = scanner.next();
		System.out.println("Enter zip");
		long zip = scanner.nextLong();
		System.out.println("Enter phone");
		long phone = scanner.nextLong();
		System.out.println("Enter email");
		String email = scanner.next();
		
		addressBook.add(new AddressBookContacts(name, city, state, zip, phone, email));
		
	}
	public void editContact(AddressBookContacts person) {
		System.out.println("What do you wish to edit for: "+person.name+".\n Enter 1 for name \n Enter 2 for"
				+ " address \n Enter 3 for phone number \n Enter 4 for email ");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			 System.out.println("enter new name");
			 person.name = scanner.next();
			 break;
		case 2:
			 System.out.println("enter new city");
			 String city = scanner.next();
			 System.out.println("enter new state");
			 String state = scanner.next();
			 System.out.println("enter new zip");
			 long zip = scanner.nextLong();
			 person.address = new Address(city, state, zip);
			 break;
		case 3:
			 System.out.println("enter new phone");
			 person.phoneNumber = scanner.nextLong();
			 break;
		case 4:
			 System.out.println("enter new email");
			 person.email = scanner.next();
			 break;
		}
//		 System.out.println(person);
	}
	
	public void editContact(String name) {
		Iterator<AddressBookContacts> iterator = addressBook.iterator();
		while(iterator.hasNext()) {
	
			AddressBookContacts person = iterator.next();
		    if(name.equalsIgnoreCase(person.name)) {
		    	editContact(person);	
		    }
		}
	}
	
	public void deleteContact(String name) {
		     
		    boolean isDeleted = addressBook.removeIf(contact -> (contact.name.equalsIgnoreCase(name)) );
		    if(isDeleted)
		    	System.out.println(name+"'s contact deleted successfully!!!");
		    else {
		    	System.out.println("NO SUCH CONTACT EXITS!!! PLEASE ENTER VALID NAME");
		        deleteContact(scanner.next());
		    }
	}

	public void addMultipleContacts() {
		System.out.println("How many person you want ro add?");
		int numberOfContacts = scanner.nextInt();
		for (int i=0;i<numberOfContacts;i++)
			this.addContact();
	}
	
	
	}

