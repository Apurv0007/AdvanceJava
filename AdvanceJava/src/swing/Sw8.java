package swing;
import javax.swing.*;
import java.awt.event.*;

public class Sw8 extends JFrame implements ActionListener  {
	JLabel l1;
	JButton b1;
	Sw8(){
		l1=new JLabel();
		l1.setBounds(60, 120, 250, 25);
		b1=new JButton("Find IP adress of the computer");
		b1.setBounds(60, 180, 200, 30);
         b1.addActionListener(this);
         add(b1);
         add(l1);
         setSize(500,600);
         setLayout(null);
         setVisible(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e) {
		try {
			String ipa=java.net.InetAddress.getByName(" ").getHostAddress();
			l1.setText("IPA of this computer is "+ipa);
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
	}

	public static void main(String[] args) {
		 new Sw8();
		

	}

}
