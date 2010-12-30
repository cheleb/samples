package org.jugmontpellier.franceinterjug.client;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldApplet extends JApplet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public HelloWorldApplet() {
	}
	public void init() {
		add(new JLabel("Hello"));
		JFrame frame = new JFrame();
		frame.setSize(100, 100);
		frame.setVisible(true);
	}

}
