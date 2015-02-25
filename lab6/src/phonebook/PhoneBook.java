package phonebook;
import java.util.*;

public class PhoneBook {
	private Map<String,LinkedList<String>> phoneBook;
	private int size;
	
	
	public PhoneBook() {
		phoneBook = new HashMap<String,LinkedList<String>>();
		size = 0;
	}
		
	/** 
	 * Associates the specified number with the specified 
	 * name in this phone book. 
	 * post: If the specified name is not present in this phone book,
	 *        the specified name is added and associated  with
	 *  	  the specified number. Otherwise the specified 
	 *  	  number is added to the set of number associated with name.
	 * @param name The name for which a phone number is to be added
	 * @param number The number associated with the specified name
	 * @return true if the specified name and number was inserted
	 */
	public boolean put(String name, String number) {
		if(!phoneBook.containsKey(name)){
			LinkedList<String> numberList = new LinkedList<String>();
			numberList.add(number);
			phoneBook.put(name, numberList);
			size++;
		} else {
			LinkedList<String> numbers = phoneBook.get(number);
			if(numbers.contains(number)){
				return false;
			} else {
				numbers.add(number);
			}
		}
		return true;
	}
	
	/**
	 * Removes the the specified name from this phone book.
	 * post: If the specified name is present in this phone book,
	 * 		 it is removed. Otherwise this phone book is
	 * 		 unchanged.
	 * @param name The name to be removed
	 * @return true if the specified name was present
	 */
	public boolean remove(String name) {
		LinkedList<String> toRemove = phoneBook.remove(name);
		if(toRemove == null){
			return false;
		}
		return true;
	}
	
	/**
	 * Retrieves a list of phone numbers for the specified name. If the 
	 * specified name is not present in this phone book an empty list is 
	 * returned.
	 * @param name The name whose associated phone numbers are to be returned  
	 * @return The phone numbers associated with the specified name
	 */
	public List<String> findNumber(String name) {
		LinkedList<String> numbers = phoneBook.get(name);
		if(numbers == null){
			return null;
		}
		return numbers;
	}
	
	/**
	 * Retrieves a list of names associated with the specified phone number. 
	 * If the specified number is not present in this phone book an empty 
	 * list is returned.
	 * @param number The number for which the set of associated
	 * names is to be returned.
	 * @return The list of names associated with the specified number
	 */
	public List<String> findNames(String number) {
		List<String> persons = new LinkedList<String>();
		Set<String> names = names();
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()){
			String currentName = itr.next();
			List<String> numbers = findNumber(currentName);
			// Om det kan finnas personer utan nummer
			if(numbers != null && numbers.contains(number)){
				persons.add(currentName);
			}
		}
		return persons;
	}
	
	/**
	 * Retrieves the set of all names present in this phone book.
	 * The set's iterator will return the names in ascending order
	 * @return The set of all names present in this phone book
	 */
	public Set<String> names() {
		Set<String> keys = phoneBook.keySet();
		System.out.println(keys);
		TreeSet<String> names = new TreeSet<String>();
		names.addAll(keys);
		return names;
	}
	
	/**
	 * Returns true if this phone book is empty
	 * @return true if this phone book is empty
	 */	
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * Returns the number of names in this phone book
	 * @return The number of names in this phone book
	 */
	public int size() {
		return size;
	}

}
