package swing;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
public class Sw41 {
	Sw41(){
		JFrame f1=new JFrame(" Panel Example");
		JPanel panel=new JPanel();
		panel.setBounds(40, 80, 400, 400);
		panel.setBackground(Color.gray);
		JButton b1=new JButton("Button 1");
		b1.setBounds(50,100,80,30);
		b1.setBackground(Color.GREEN);
		JButton b2=new JButton("Button 2");
		b2.setBounds(100, 100, 80, 30);
		b2.setBackground(Color.red);
		panel.add(b1);
		panel.add(b2);
		f1.add(panel);
		f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		 Sw41 ob=new Sw41();

	}

}
