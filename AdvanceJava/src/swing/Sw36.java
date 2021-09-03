package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sw36 extends JFrame implements ActionListener{
	JButton b1;
	Container c1;
	Sw36(){
		c1=getContentPane();
		c1.setLayout(new FlowLayout());
		b1=new JButton("Color");
		b1.addActionListener(this);
		c1.add(b1);
	}
	public void actionPerformed(ActionEvent e) {
		Color initialcolor=Color.cyan;
		Color color=JColorChooser.showDialog(this, " Select a colour", initialcolor);
		c1.setBackground(color);
	}

	public static void main(String[] args) {
		Sw36 ch1=new Sw36();
		ch1.setSize(500, 600);
		ch1.setVisible(true);
		ch1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}

}
