package applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<Applet code='App4.class' width='600' height='600'></Applet>
public class App4 extends Applet implements ActionListener
{
	int n1,n2,n3;
	String s1,s2,s3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5;
	public void init() {
		Label l1 = new Label("Enter the number in the Text Field");
		add(l1);
		t1=new TextField(10);
		add(t1);
		t2=new TextField(10);
		add(t2);
		b1=new Button("+");
		add(b1);
		b1.addActionListener(this);
		b2=new Button("-");
		add(b2);
		b2.addActionListener(this);
		b3=new Button("x");
		add(b3);
		b3.addActionListener(this);
		b4=new Button("/");
		add(b4);
		b4.addActionListener(this);
		b5=new Button("%");
		add(b5);
		b5.addActionListener(this);
		t3=new TextField(10);
		add(t3);
				
	}
	public void actionPerformed(ActionEvent e) {
		s1=t1.getText();
		n1=Integer.parseInt(s1);
		s2=t2.getText();
		n2=Integer.parseInt(s2);
		if(e.getSource()==b1) {
			n3=n1+n2;
			s3=String.valueOf(n3);
			t3.setText(s3);
		}
		else if(e.getSource()==b2) {
			n3=n1-n2;
			s3=String.valueOf(n3);
			t3.setText(s3);
		}
		else if(e.getSource()==b3) {
			n3=n1*n2;
			s3=String.valueOf(n3);
			t3.setText(s3);
		}
		else if(e.getSource()==b4) {
			n3=n1/n2;
			s3=String.valueOf(n3);
			t3.setText(s3);
		}
		else if(e.getSource()==b5) {
			n3=n1%n2;
			s3=String.valueOf(n3);
			t3.setText(s3);
		}
	}

}
