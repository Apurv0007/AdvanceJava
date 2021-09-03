package swing;

import javax.swing.*;
import java.awt.*;

public class Sw43 {
	Sw43(){
		JFrame f1=new JFrame("JTool bar Example");
		JToolBar toolbar=new JToolBar();
		toolbar.setRollover(true);
		JButton  button=new JButton("file");
		 toolbar.add(button);
		 toolbar.addSeparator();
		 toolbar.add(new JButton("Edit"));
		 toolbar.add(new JComboBox(new String[] {"format","font","color","background"}));
		 Container contentPane =f1.getContentPane();
		 contentPane.add(toolbar,BorderLayout.CENTER);
		 f1.setSize(500, 600);
		 f1.setVisible(true);
		 f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Sw43 ob=new Sw43();
	
	}

}
