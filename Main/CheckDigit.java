package Main;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CheckDigit extends Panel implements ActionListener, KeyListener, ItemListener {
	
	
	JPanel p1 = new JPanel();
	JLabel n = new JLabel("Enter your ID Number");
    JLabel a = new JLabel("-");
    JLabel b = new JLabel("-");
    JLabel e = new JLabel("-");
    JLabel d = new JLabel("-");
        
    protected JTextField fn1 = new JTextField("", 1);
    protected JTextField fn2 = new JTextField("", 1);
    protected JTextField fn3 = new JTextField("", 1);
    protected JTextField fn4 = new JTextField("", 1);
    protected JTextField fn5 = new JTextField("", 1);
    protected JTextField fn6 = new JTextField("", 1);
    protected JTextField fn7 = new JTextField("", 1);
    protected JTextField fn8 = new JTextField("", 1);
    protected JTextField fn9 = new JTextField("", 1);
    protected JTextField fn10 = new JTextField("", 1);
    protected JTextField fn11 = new JTextField("", 1);
    protected JTextField fn12 = new JTextField("", 1);
    protected JTextField fn13 = new JTextField("", 1);
    
	
    Checkbox cb = new Checkbox("Clear Your ID Number");    
	
    
	JPanel p2 = new JPanel();
	JButton c = new JButton("Compute Check Digit");
    JLabel cd = new JLabel("Your Check Digit is ");
    
    JPanel p3 = new JPanel();
	JLabel in1 = new JLabel("* Plese Fill your ID number 1 by 1 *", JLabel.CENTER);
    
    public CheckDigit(String title) {
        super();
        p1.setLayout(new FlowLayout());
        p1.add(n); p1.add(fn1);p1.add(a);p1.add(fn2);p1.add(fn3);p1.add(fn4);p1.add(fn5);p1.add(b);p1.add(fn6);p1.add(fn7);p1.add(fn8);p1.add(fn9);p1.add(fn10);p1.add(e);p1.add(fn11);p1.add(fn12);p1.add(d);p1.add(fn13);
        p2.setLayout(new GridLayout(3,1));
        p2.add(c);p2.add(cb);p2.add(cd);
        p3.add(in1);
        c.addActionListener(this);
        fn13.addKeyListener(this);
        cb.addItemListener(this);
        in1.setFont(new Font("Serif", Font.BOLD, 14));
        this.add(p1);
        this.add(p1,BorderLayout.NORTH);
        this.add(p2,BorderLayout.CENTER);       
        this.add(p3,BorderLayout.SOUTH);
        this.setSize(450, 180); 
        this.setVisible(true); 
	    }
    
    	@Override                                               
       
    			public void actionPerformed(ActionEvent e) {  
    		double n12 = Double.parseDouble(fn12.getText());         

            double n11 = Double.parseDouble(fn11.getText());

            double n10 = Double.parseDouble(fn10.getText());

            double n9 = Double.parseDouble(fn9.getText());

            double n8 = Double.parseDouble(fn8.getText());

            double n7 = Double.parseDouble(fn7.getText());

            double n6 = Double.parseDouble(fn6.getText());

            double n5 = Double.parseDouble(fn5.getText());

            double n4 = Double.parseDouble(fn4.getText());

            double n3 = Double.parseDouble(fn3.getText());
            
            double n2 = Double.parseDouble(fn2.getText());

            double n1 = Double.parseDouble(fn1.getText());

            double ch = Double.parseDouble(fn13.getText());
            
            double an1 = Math.abs(n1);
            double an2 = Math.abs(n2);
            double an3 = Math.abs(n3);
            double an4 = Math.abs(n4);
            double an5 = Math.abs(n5);
            double an6 = Math.abs(n6);
            double an7 = Math.abs(n7);
            double an8 = Math.abs(n8);
            double an9 = Math.abs(n9);
            double an10 = Math.abs(n10);
            double an11 = Math.abs(n11);
            double an12 = Math.abs(n12);
          
            double cch1 = (an1*13)+(an2*12)+(an3*11)+(an4*10)+(an5*9)+(an6*8)+(an7*7)+(an8*6)+(an9*5)+(an10*4)+(an11*3)+(an12*2);
            double cch = 11-(cch1%11);                  
            
        	
            cd.setText("Your Check Digit is "+ cch);
            if (e.getSource() == c) {
    			if (ch == cch){
    				this.removeAll();
    				this.add(new Result());
    			
    	}	else if (ch!= cch){    				
    				in1.setText("Your ID Number is Wrong");	
    				p3.add(in1,BorderLayout.SOUTH);	
    		}    
    		 }
    	}    		
    				
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode()==KeyEvent.VK_ENTER){
				double n12 = Double.parseDouble(fn12.getText());         

	            double n11 = Double.parseDouble(fn11.getText());

	            double n10 = Double.parseDouble(fn10.getText());

	            double n9 = Double.parseDouble(fn9.getText());

	            double n8 = Double.parseDouble(fn8.getText());

	            double n7 = Double.parseDouble(fn7.getText());

	            double n6 = Double.parseDouble(fn6.getText());

	            double n5 = Double.parseDouble(fn5.getText());

	            double n4 = Double.parseDouble(fn4.getText());

	            double n3 = Double.parseDouble(fn3.getText());
	            
	            double n2 = Double.parseDouble(fn2.getText());

	            double n1 = Double.parseDouble(fn1.getText());

	            double ch = Double.parseDouble(fn13.getText());
	            
	            double an1 = Math.abs(n1);
	            double an2 = Math.abs(n2);
	            double an3 = Math.abs(n3);
	            double an4 = Math.abs(n4);
	            double an5 = Math.abs(n5);
	            double an6 = Math.abs(n6);
	            double an7 = Math.abs(n7);
	            double an8 = Math.abs(n8);
	            double an9 = Math.abs(n9);
	            double an10 = Math.abs(n10);
	            double an11 = Math.abs(n11);
	            double an12 = Math.abs(n12);
	          
	            double cch1 = (an1*13)+(an2*12)+(an3*11)+(an4*10)+(an5*9)+(an6*8)+(an7*7)+(an8*6)+(an9*5)+(an10*4)+(an11*3)+(an12*2);
	            double cch = 11-(cch1%11);                  
	            	          
	            cd.setText("Your Check Digit is "+ cch);
	            
	            if (e.getSource() == fn13) {
	    			if (ch == cch){
	    				this.removeAll();
	    				this.add(new Result());
	    			
	    	}	else if (ch!= cch){    				
	    				in1.setText("Your ID Number is Wrong");	
	    				p3.add(in1,BorderLayout.SOUTH);	
	    		}    
	    		}
	    	}    		
		}	    				
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getSource() == cb) {					
					fn1.setText("");
	            	fn2.setText("");
	            	fn3.setText("");
	            	fn4.setText("");
	            	fn5.setText("");
	            	fn6.setText("");
	            	fn7.setText("");
	            	fn8.setText("");
	            	fn9.setText("");
	            	fn10.setText("");
	            	fn11.setText("");
	            	fn12.setText("");
	            	fn13.setText("");
	            }
					
				}
				
			}
			
		
   

		
        	
        	




		


		

//2,12	

		
			
		

		
		
		

		
      
		    
		        		
            		
            		