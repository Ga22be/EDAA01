package test;

import java.util.LinkedList;

import phonebook.PhoneBook;

public class OwnTestPhoneBook {

	public static void main(String[] args) {
		PhoneBook book = new PhoneBook();
		book.put("Peter","22");
		book.put("Adam", "33");
		book.put("Erik", "44");
		
		System.out.println(book.names());
		
		

	}

}
