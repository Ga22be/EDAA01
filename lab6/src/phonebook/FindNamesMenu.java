package phonebook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;

public class FindNamesMenu extends JMenuItem implements ActionListener {
	private PhoneBook phoneBook;
	private PhoneBookGUI gui;

	public FindNamesMenu(PhoneBook phoneBook, PhoneBookGUI gui) {
		super("Find Name(s)");
		this.phoneBook = phoneBook;
		this.gui = gui;
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String number = JOptionPane.showInputDialog("Number to search for");
		if (number == null)
			return;
		List<String> names = phoneBook.findNames(number);
		if (names.isEmpty()) {
			names.add("Finns ingen person med detta nummer");
		}
		gui.print(names);
	}

}
