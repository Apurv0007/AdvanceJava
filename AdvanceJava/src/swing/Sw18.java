package swing;
import javax.swing.*;
import java.awt.event.*;

public class Sw18 extends JFrame implements ActionListener {
	JRadioButton rb1,rb2;
	JButton b1;
	Sw18()
	{
		rb1=new JRadioButton("Male");
		rb1.setBounds(100,50,100,30);
		rb2=new JRadioButton("Female");
		rb2.setBounds(100, 100, 100, 30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		b1=new JButton("Click");
		b1.setBounds(100,150,100,30);
		b1.addActionListener(this);
		add(rb1);
		add(rb2);
		add(b1);
		setSize(500,600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
			{
		if(rb1.isSelected()) {
			JOptionPane.showMessageDialog(this, "You have selected Male");
		}
		if(rb2.isSelected()) {
			JOptionPane.showMessageDialog(this, "You have selected Female");
			
		}
		
			}
		

	public static void main(String[] args) {
		new Sw18();
		

	}

}
