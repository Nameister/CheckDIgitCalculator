package Main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class TestCheckDigit {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("CheckDigit Calculat");
		CheckDigit myCheckDigit = new CheckDigit("my CheckDigit");
	        frame.add(myCheckDigit);
	        frame.setSize(450, 180); 
	        frame.setLocationRelativeTo(null); 
	        frame.setVisible(true); 
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
