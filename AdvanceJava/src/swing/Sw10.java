package swing;
import javax.swing.*;
import java.awt.event.*;

public class Sw10 implements ActionListener {
	JTextField tf1, tf2,tf3;
	JButton b1,b2,b3,b4,b5;
	char op=' ';
	Sw10(){
		JFrame f1=new JFrame("Sasta calculator");
		tf1=new JTextField();
		tf1.setBounds(105,50,150,20);
		tf2=new JTextField();
		tf2.setBounds(105,100,150,20);
		tf3=new JTextField();
		tf3.setBounds(105,150,150,20);
	    tf3.setEditable(false);
	    b1=new JButton("+");
		b1.setBounds(30,200,50,30);
		b2=new JButton("-");
		b2.setBounds(90,200,50,30);
		b3=new JButton("x");
		b3.setBounds(150,200,50,30);
		b4=new JButton("/");
		b4.setBounds(210,200,50,30);
		b5=new JButton("%");
		b5.setBounds(270,200,50,30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		f1.add(tf1);
		f1.add(tf2);
		f1.add(tf3);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		f1.add(b5);
		f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e) {
		String s1=tf1.getText();
		String s2=tf2.getText();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=0;
		if(e.getSource()==b1) {
			c=a+b;
			op='+';
		}
		else if(e.getSource()==b2) {
			c=a-b;
			op='-';
		}
		else if(e.getSource()==b3) {
			c=a*b;
			op='*';
		}
		else if(e.getSource()==b4) {
			c=a/b;
			op='/';
		}
		else if(e.getSource()==b5) {
			c=a%b;
			op='%';
		}
		String result=String.valueOf(c);
		tf3.setText(result);
	}

	public static void main(String[] args) {
		new Sw10();
		

	}

}
