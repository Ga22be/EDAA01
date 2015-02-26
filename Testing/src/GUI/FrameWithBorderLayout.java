package GUI;

import javax.swing.*;

import java.awt.*;

public class FrameWithBorderLayout {
	public FrameWithBorderLayout() {
		JFrame frame = new JFrame("A BorderLayout Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new BorderLayout());
		frame.add(panel, BorderLayout.SOUTH);
		panel.add(new JButton("South"), BorderLayout.WEST);
		panel.add(new JButton("South2"), BorderLayout.CENTER);
		panel.add(new JButton("South3"), BorderLayout.EAST);
		frame.add(new JButton("North"), BorderLayout.NORTH);
		frame.add(new JButton("East"), BorderLayout.WEST);
		frame.add(new JButton("West"), BorderLayout.EAST);
		frame.add(new JButton("Center"), BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new FrameWithBorderLayout();
	}
}
