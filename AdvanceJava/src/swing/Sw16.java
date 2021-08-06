package swing;
import javax.swing.*;
import java.awt.event.*;

public class Sw16 extends JFrame implements ActionListener  {
	
	JLabel l;
	JCheckBox cb1,cb2,cb3;
	JButton b;
	Sw16(){
		l=new JLabel("Jaggu  Food ordering system");
		 l.setBounds(50,50,300,20);
		 cb1=new JCheckBox("Pizza @200");
		 cb1.setBounds(100,100,150,20);
		 cb2=new JCheckBox("Burger @ 50");
		 cb2.setBounds(100,150,150,20);
		 cb3=new JCheckBox("Tea @ 20");
		 cb3.setBounds(100,200,150,20);
		 b=new JButton("Order");
		 b.setBounds(100,250,80,30);
		 b.addActionListener(this);
		 add(l);
		 add(cb1);
		 add(cb2);
		 add(cb3);
		 add(b);
		 setSize(500, 600);
		 setLayout(null);
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void  actionPerformed (ActionEvent e) {
		float amount=0;
		String msg=" ";
		if(cb1.isSelected()) {
			amount +=200;
			msg+="Pizza @200\n";
		}
		if(cb2.isSelected()) {
			amount +=50;
			msg+="Burger @50\n";
		}
		if(cb3.isSelected()) {
			amount +=20;
			msg+="Tea @20\n";
		}
		msg+="-----------------------\n";
		JOptionPane.showMessageDialog(this, msg+"Total"+ amount);
		
	}

	public static void main(String[] args) {
		new Sw16();
		

	}

}
