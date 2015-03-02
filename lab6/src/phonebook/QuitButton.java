package phonebook;

import javax.swing.*;
import java.awt.event.*;

public class QuitButton extends JButton implements ActionListener {
	private PhoneBook phoneBook;
	private PhoneBookGUI gui;

	public QuitButton(PhoneBook phoneBook, PhoneBookGUI gui) {
		super("Quit");
		this.phoneBook = phoneBook;
		this.gui = gui;
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		switch (JOptionPane.showConfirmDialog(null, "Vill du spara katalogen?")) {
		case 0:
			String s = JOptionPane.showInputDialog("Vad ska sparfilen heta?");
			if(s == null){
				return;
			}
			phoneBook.save(s);
			break;
		case 1:
			break;
		case 2:
			return;
		}
		System.exit(0);
	}
}
