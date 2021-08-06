package swing;
import javax.swing.*;
import java.awt.event.*;

public class Sw13 {

	public static void main(String[] args) {
		JFrame f1=new JFrame("Password filled example");
		final JLabel label=new JLabel();
		label.setBounds(20,150,300,50);
		
		JLabel l1=new JLabel("Enter User Name:");    
        l1.setBounds(50,20,130,30); 
         final JTextField text = new JTextField();  
        text.setBounds(190,20, 100,30); 
        
        
		JLabel l2=new JLabel("Enter the password :");
				l2.setBounds(50,75,130,30);
	final JPasswordField value =new JPasswordField();
	value.setBounds(190,75,100,30);
	
	
	JButton b=new JButton("Login");
	b.setBounds(110,120,80,30);
	f1.add(value);
	f1.add(l1);
	f1.add(label);
	f1.add(l2);
	f1.add(b);
	f1.add(text);
	f1.setSize(500, 600);
	f1.setLayout(null);
	f1.setVisible(true);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	b.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent e) 
			{
		String un,ps;
		un=text.getText();
		ps=new String(value.getPassword());
		if(un.compareTo("apurv")==0&&ps.compareTo("1234")==0)
			label.setText("Welcome Apurv");
		else if(un.compareTo("avinash")==0&&ps.compareTo("1010")==0)
			label.setText("Welcome Avinash");
		else
		label.setText("Invalid"+un+"Ps"+ps);
	}
			
			
			
			});
	
	
	

	}

}
