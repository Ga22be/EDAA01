package phonebook;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class PhoneBookGUI extends JFrame {
	private PhoneBook phoneBook;
	private JTextArea messageArea;

	public PhoneBookGUI(PhoneBook pb) {
		super("PhoneBook");
		phoneBook = pb;

		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

		Locale.setDefault(new Locale("en"));
		/* To avoid hardcoded Swedish text on OptionPane dialogs */
		UIManager.put("OptionPane.cancelButtonText", "Cancel");

		setLayout(new BorderLayout());
		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);
		JMenu editMenu = new JMenu("Edit");
		JMenu findMenu = new JMenu("Find");
		JMenu viewMenu = new JMenu("View");
		menubar.add(editMenu);
		menubar.add(findMenu);
		menubar.add(viewMenu);
		editMenu.add(new AddMenu(phoneBook, this));
		editMenu.add(new RemoveMenu(phoneBook, this));
		viewMenu.add(new ShowAllMenu(phoneBook, this));
		findMenu.add(new FindNamesMenu(phoneBook, this));
		findMenu.add(new FindNumbersMenu(phoneBook, this));

		JPanel southPanel = new JPanel();
		messageArea = new JTextArea(4, 25);
		messageArea.setEditable(false);
		southPanel.add(new JScrollPane(messageArea));
		southPanel.add(new QuitButton(phoneBook, this));
		add(southPanel, BorderLayout.CENTER);
		
		if(!phoneBook.isEmpty()){
			print(phoneBook.names());
		}
		pack();
		setVisible(true);
	}

	public void print(Collection<String> toPrint) {
		messageArea.setText("");
		for (String s : toPrint) {
			messageArea.append(s + ", ");
		}
		messageArea.repaint();
	}

	public void save(String fileName) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream(fileName));
			out.writeObject(phoneBook);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
