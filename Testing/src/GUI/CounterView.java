package GUI;

import javax.swing.*;

public class CounterView {
	public CounterView() {
		// Skapar ett nytt fönster
		JFrame frame = new JFrame("Counter");
		// Sätt fönsterstorlek till 600x600
		frame.setSize(600, 600);
		// Exekvering ska sluta om användaren stänger fönstret
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Skapar en panel
		JPanel panel = new JPanel();
		// Lägg till panelen i fönstret
		frame.add(panel);
		// Skapar en ny knapp med texten "Yes!"
		JButton button = new JButton("Yes!");
		// Lägger till knappen i panelen som ligger i framen
		panel.add(button);
		// Skapa en ny etikett
		JLabel label = new JLabel("Number yes: " + 0);
		// Lägg till etiketten i panelen efter knappen
		panel.add(label);
		// Se till att fönstrets storlek passar till layout
		// Ändrar storleken efter setSize(x,y) igen
//		frame.pack();
		// Gör fönstret synligt
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new CounterView();
	}
}
