package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ClearButton extends JButton implements ActionListener{
	private OwnGUI gui;
	
	public ClearButton(OwnGUI gui){
		super("Clear");
		this.gui = gui;
		addActionListener(this);
		this.setToolTipText("Clears the sudoku board");
	}
	
	public void actionPerformed(ActionEvent e){
		gui.clearPuzzle();
		gui.repaint();
	}

}
