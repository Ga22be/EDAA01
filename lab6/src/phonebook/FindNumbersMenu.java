package phonebook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class FindNumbersMenu extends JMenuItem implements ActionListener {
	private PhoneBook phoneBook;
	private PhoneBookGUI gui;

	public FindNumbersMenu(PhoneBook phoneBook, PhoneBookGUI gui) {
		super("Find Number(s)");
		this.phoneBook = phoneBook;
		this.gui = gui;
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String name = JOptionPane.showInputDialog("Name to search for");
		if (name == null)
			return;
		List<String> numbers = phoneBook.findNumber(name);
		if (numbers.isEmpty()) {
			numbers.add("Finns inga nummer för denna personen");
		}
		gui.print(numbers);
	}

}
