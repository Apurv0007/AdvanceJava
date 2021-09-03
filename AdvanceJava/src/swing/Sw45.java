package swing;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class Sw45 extends JFrame 
{
	public Sw45() {
		super("Tool bar");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JToolBar bar=new JToolBar();
		JButton cut=new JButton(new ImageIcon("a1.bmp"));
		JButton copy=new JButton(new ImageIcon("a5.jpg"));
		bar.add(cut);
		bar.add(copy);
		getContentPane().add(bar,BorderLayout.PAGE_START);
		setSize(500,300);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new Sw45();

	}

}
