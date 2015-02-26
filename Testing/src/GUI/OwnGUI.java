package GUI;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OwnGUI {
	public OwnGUI() {
		JFrame frame = new JFrame("Sudoku");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
//		Dimension min = new Dimension(300, 300);
//		frame.setMinimumSize(min);
		frame.setResizable(false);

		JPanel gamePanel = new JPanel(new GridLayout(9, 9));
		OneLetterField[] box = new OneLetterField[81];
		for(int i = 0; i < 18; i++){
			box[i] = new OneLetterField();
			gamePanel.add(box[i]);			
		}
		
		frame.add(gamePanel);
		
		
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new OwnGUI();
	}

}
