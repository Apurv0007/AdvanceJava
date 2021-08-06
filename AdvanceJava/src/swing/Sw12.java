package swing;
import javax.swing.*;
public class Sw12 {

	public static void main(String[] args) {
		JFrame f1=new JFrame("Password field Example");
		JPasswordField pass=new JPasswordField();
		JLabel l1=new JLabel("Enter the password:");
		l1.setBounds(50,100,150,30);
		pass.setBounds(210,100,100,30);
		f1.add(l1);
		f1.add(pass);
		f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
