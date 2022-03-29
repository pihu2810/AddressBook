package com.Bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain 
{
	
	public static void addressBookContacts(String FirstName,String LastName,String Address,String City,long Zip,long PhoneNumber, String Email)
	{
		AddressBookContacts addressBookContacts=new AddressBookContacts();
		 addressBookContacts.setFirstName(FirstName);
			addressBookContacts.setLastName(LastName);
			addressBookContacts.setAddress(Address);
			addressBookContacts.setCity(City);
			addressBookContacts.setZip(Zip);
			addressBookContacts.setPhoneNumber(PhoneNumber);
			addressBookContacts.setEmail(Email);
			List<AddressBookContacts> contactList=new ArrayList<AddressBookContacts>();
			contactList.add(addressBookContacts);
			printContact(contactList);
	}
	public static void printContact(List<AddressBookContacts> contactList) {
		System.out.println("********Print Contact*******");
			for(int i=0;i<contactList.size();i++) {
				
				System.out.println("First name:"+contactList.get(i).getFirstName());
			    System.out.println("Lastname:"+contactList.get(i).getLastName());
				System.out.println("Address:"+contactList.get(i).getAddress());
				System.out.println("City:"+contactList.get(i).getCity());
				System.out.println("Zip:"+contactList.get(i).getZip());
				System.out.println("PhoneNumber:"+contactList.get(i).getPhoneNumber());
				System.out.println("Email:"+contactList.get(i).getEmail());
				
				System.out.println("***************");
			}
	}
  public static void main(String args [])
  {
	  System.out.println("Welcome to Address Book Program");
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number of person in AddressBook");
	  String n=sc.next();
	  AddressBookContacts  addressBookContacts=new AddressBookContacts();
	  System.out.println("Enter FirstName");
	  String FirstName=sc.next();
	  System.out.println("Enter LastName");
	  String LastName=sc.next();
	  System.out.println("Enter Address");
	  String Address=sc.next();
	  System.out.println("Enter City");
	  String City=sc.next();
	  System.out.println("Enter Zip");
	  long Zip=sc.nextLong();
	  System.out.println("Enter PhoneNumber");
	  long PhoneNumber=sc.nextLong();
	  System.out.println("Enter Email");
	  String Email=sc.next();
	  
	 
		
	  addressBookContacts(FirstName,LastName,Address,City,Zip,PhoneNumber,Email);
	 // addressBookContacts.AddressBookContacts(String firstName, String lastName, String address, String city, String state, long zip,long phoneNumber, String email);
		;
 
	
  }
}
