package swing;
import javax.swing.*;

import java.awt.*;

public class Sw44 extends JFrame {
      public Sw44() 
      {
    	 
		super("LayeredPane Example");
		
		setSize(500, 600);
		JLayeredPane pane=getLayeredPane();
		JButton top=new JButton();
		top.setBackground(Color.white);
		top.setBounds(20, 20, 50, 50);
		JButton middle=new JButton();
		middle.setBackground(Color.red);
		middle.setBounds(40, 40, 50, 50);
		
		JButton bottom=new JButton();
		bottom.setBackground(Color.cyan);
		bottom.setBounds(60, 60, 50, 50);
		
		pane.add(bottom,new Integer(1));
		pane.add(middle,new Integer(2));
		pane.add(top,new Integer(3));
		
		
		
	}


	


	public static void main(String[] args) {
		Sw44 ob=new Sw44();
		ob.setVisible(true);
		ob.setLayout(null);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		
		
		

	}

}
