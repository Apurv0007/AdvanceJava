package swing;
import javax.swing.*;

public class Sw47 { 
	Sw47(){
		JFrame f1=new JFrame("Tool Tip Example");
		JPasswordField value =new JPasswordField();
		value.setBounds(200, 100, 100, 30);
		value.setToolTipText("Enter your password");
		JLabel l1=new JLabel("Password:");
		l1.setBounds(100, 100, 80, 30);
		f1.add(value);
		f1.add(l1);
		f1.setSize(600, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		Sw47 ob=new Sw47();
		

	}

}
