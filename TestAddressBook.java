package com.bridgelabz.addressbook;

public class TestAddressBook {

public static void main(String args[]) {
			Contact Main = new Main();
			
			System.out.println("Welcome to Address Book");
			
			AddressBook addressBook = new AddressBook();
			
			addressBook.addContact(Main);
			addressBook.print();
		}
	}
	
	
	
	
	
	
