package Main;

import java.awt.event.*;
import java.util.Random;

import javax.swing.Timer;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


	
public class Result extends Panel{
	
	Timer timer = new Timer(800, new TimerListener());
	
	int x1 = 250 ;
	int y1 = 85 ;
	int x2 = 85 ;
	int y2 = 250 ;
	
	public Result() {
			timer.start();
			this.setBounds(0,0,450,180); // set bounds
			this.setVisible(true);
			this.setLayout(null);
	}
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.yellow);
		g.fillRect(x1, y1, 11, 11);
		
		g.setColor(Color.orange);
		g.fillRect(x2, y2, 11, 11);
			
		g.setColor(Color.green);
		g.fillOval(76, 58, 11, 11);
		
		g.setColor(Color.green);
		g.fillOval(356, 58, 11, 11);							
		
		g.setColor(Color.blue);
		Font t = new Font( "SansSerif", Font.BOLD, 20 );
		g.setFont(new Font("SansSerif", Font.BOLD, 20)); 		
		g.drawString("Your Check Digit is Correct!", 90, 70);
		
	}

	class TimerListener implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		x1 = random.nextInt(200);
		y1 = random.nextInt(40);
		
		x2 = random.nextInt(450);
		y2 = random.nextInt(180);
		repaint();		
	}
}

	
}

	



