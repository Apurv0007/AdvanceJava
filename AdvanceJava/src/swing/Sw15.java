package swing;
import javax.swing.*;
import java.awt.event.*;

public class Sw15 {
	Sw15(){
		JFrame f1=new JFrame("Check Box example");
		final JLabel label=new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400,100);
		JCheckBox c1=new JCheckBox("Java");
		c1.setBounds(150,100,100,50);
		JCheckBox c2=new JCheckBox("Python");
		c2.setBounds(150,150,100,50);
		f1.add(c1);
		f1.add(c2);
		f1.add(label);
		f1.setSize(500, 600);
		f1.setLayout(null);f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c1.addItemListener(new ItemListener()
				{
			public void itemStateChanged(ItemEvent e) {
				
				label.setText("JAVA checkbox :"+(e.getStateChange()==1?"checked":"unchecked"));
			}
				});
		c2.addItemListener(new ItemListener()
		{
	public void itemStateChanged(ItemEvent e) {
		
		label.setText("Python checkbox :"+(e.getStateChange()==1?"checked":"unchecked"));
	}
		});
		
		
		
	}

	public static void main(String[] args) {
	new Sw15();

	}

}
