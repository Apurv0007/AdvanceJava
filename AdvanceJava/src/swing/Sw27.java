package swing;
import javax.swing.*;
import java.awt.event.*;

public class Sw27 extends WindowAdapter
{
	JFrame f1;

	Sw27()
	{
		f1=new JFrame();
		f1.addWindowListener(this);
		f1.setSize(500, 600);
		f1.setLayout(null);
		
		f1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f1.setVisible(true);
	}
	public void windowClosing(WindowEvent e) 
	{
		int a=JOptionPane.showConfirmDialog(f1, "Are you sure?");
		if(a==JOptionPane.YES_OPTION) 
		{
	    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	public static void main(String[] args) {
		new Sw27();

	}

}
