//DUMMY LOGIN
package swing;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Sw50  extends JFrame {
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton b1, b2;
	Sw50(){
		setVisible(true);
		setLayout(null);
		setSize(1370,730);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel("Enter the user Name");
		l1.setForeground(Color.red);
		l1.setFont(new Font("serif",Font.BOLD,20));
		add(l1);
		l1.setBounds(430, 200, 200, 20);
		l2=new JLabel("Enter the password");
		l2.setForeground(Color.red);
		l2.setFont(new Font("serf",Font.BOLD,20));
		add(l2);
		l2.setBounds(430, 240, 200, 20);
		 t1=new JTextField();
		 add(t1);
		 t1.setBounds(650, 200, 200, 22);
		  p1=new JPasswordField();
		  add(p1);
		  p1.setBounds(650, 240, 200, 22);
		  
		  b1=new JButton("LOGIN");
		  add(b1);
		  b1.setBounds(540, 280, 100, 22);
		  b2=new JButton("Cancle");
		  add(b2);
		  b2.setBounds(640, 280, 100, 22);
		  b1.addActionListener(new Select());
	}
	class Select implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String u, p;
			int c=0;
			try {
				u=t1.getText();
				p=p1.getText();
				if((u.compareTo("Admin"))==0&&(p.compareTo("1234"))==0)
				{
					c++;
				}
				if(c>0) {
					showData();
					t1.setText("");
					p1.setText("");
				}
				else {
					JOptionPane.showMessageDialog(null, "Insert User Name or Password");
					t1.setText("");
					p1.setText("");
				}
			}
			catch(Exception e1)
			{
				
			}
		}
		void showData()
		{
			try 
			{
				dispose();
				JFrame f1=new JFrame();
				f1.setVisible(true);
				f1.setSize(1366, 736);
				f1.setLayout(null);
				f1.setTitle("Inventory System");
				f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	

	public static void main(String[] args) {
		
		new Sw50();

	}

}
