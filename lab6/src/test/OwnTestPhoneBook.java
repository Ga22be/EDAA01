package test;

import phonebook.PhoneBook;
import phonebook.PhoneBookGUI;

public class OwnTestPhoneBook {

	public static void main(String[] args) {
		PhoneBook book = new PhoneBook();
		book.put("Peter","22");
		book.put("Adam", "33");
		book.put("Erik", "44");
		book.put("Erik", "55");
		
		System.out.println(book.names());
		
		new PhoneBookGUI(book);
		
		

	}

}
