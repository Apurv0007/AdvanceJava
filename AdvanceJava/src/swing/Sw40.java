package swing;
import javax.swing.*;
import java.awt.event.*;

public class Sw40 implements ActionListener{
	JFrame f1;
	 public Sw40()
	{
		f1=new JFrame("show message dilouge");
		JButton b1=new JButton("Click me");
		b1.addActionListener(new MyAction() );
		b1.setBounds(100, 100, 100, 30);
		f1.add(b1);
		f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	public class MyAction implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e) 
		{
			JOptionPane.showMessageDialog(f1, "Argus Acadmey");
		}
	}

	public static void main(String[] args) {
		 new Sw40();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	

	

}
