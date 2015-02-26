package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SolveButton extends JButton implements ActionListener{
	private OwnGUI gui;
	
	public SolveButton(OwnGUI gui){
		super("Solve");
		this.gui = gui;
		addActionListener(this);
		this.setToolTipText("Solves the sudoku");
		
	}
	
	public void actionPerformed(ActionEvent e){
		int[][] table = gui.to2DArray();
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				System.out.print(table[i][j]);
			}
			System.out.println();
		}
	}

}
