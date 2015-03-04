package phonebook;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		PhoneBook phoneBook;
		if (JOptionPane.showConfirmDialog(null, "Vill du öppna från fil?") == 0) {
			String s = JOptionPane.showInputDialog("Vad heter filen?");
			if (s != null) {
				try {
					ObjectInputStream in = new ObjectInputStream(new FileInputStream(
							s));
					phoneBook = (PhoneBook) in.readObject();
				} catch (Exception e) {
					phoneBook = new PhoneBook();
					// e.printStackTrace();
					// System.exit(1);
				}
			} else {
				phoneBook = new PhoneBook();				
			}
		} else {
			phoneBook = new PhoneBook();
		}
		new PhoneBookGUI(phoneBook);
	}

}
