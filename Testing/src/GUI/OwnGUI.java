package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OwnGUI {
	OneDigitField[] box;
	JPanel gamePanel;
	
	public OwnGUI() {
		JFrame frame = new JFrame("Sudoku");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
//		Dimension min = new Dimension(300, 300);
//		frame.setMinimumSize(min);
		frame.setResizable(false);
		box = new OneDigitField[81];

		gamePanel = new JPanel(new GridLayout(9, 9));
		frame.add(gamePanel);
		JPanel buttonField = new JPanel();
		frame.add(buttonField, BorderLayout.SOUTH);
		
		for(int i = 0; i < 81; i++){
			box[i] = new OneDigitField();
//			box[i].setText(new Integer(i % 9).toString());
			if(isColored(i)){
				box[i].setBackground(Color.LIGHT_GRAY);
			}
			gamePanel.add(box[i]);			
		}
		
		
		buttonField.add(new SolveButton(this));
		buttonField.add(new ClearButton(this));
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new OwnGUI();
	}
	
	private boolean isColored(int index){
		if((index / 27) % 2 == 0){
			if((index / 9) % 2 == 0){
				if((index / 3) % 2 == 0){
					return true;
				} 					
			} else {
				if((index / 3) % 2 == 1){
					return true;
				}
			}
		} else {
			if((index / 9) % 2 == 0){
				if((index / 3) % 2 == 1){
					return true;
				} 					
			} else {
				if((index / 3) % 2 == 0){
					return true;
				}
			}
		}
		return false;
	}
	
	public int[][] to2DArray(){
		int[][] table = new int[9][9];
		for(int i = 0; i < 81; i++){
			int x = i % 9;
			int y = i / 9;
			if(box[i].getText() == ""){
				table[y][x] = 0;
			} else {
				table[y][x] = new Integer(box[i].getText());
				// TODO
			}
		}
		return table;
	}
	
	public void clearPuzzle(){
		for(int i = 0; i < 81; i++){
			box[i].setText(" ");
		}
	}
	
	public void repaint(){
		gamePanel.repaint();
	}

}
