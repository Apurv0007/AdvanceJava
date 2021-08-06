package applet;
import java.awt.*;

import java.applet.*;
import java.awt.event.*;
//<Applet code="App17.class" width="400" height="400"></Applet>

public class App17 extends Applet implements ActionListener{
	TextField name,pass;
	Label l1,l2;
	String s1="Admin",s2,p1="1234",p2,msg="Login kro";
	Image img;
	public void init() {
		
		Button b1;
		Label l1=new Label("User Name",Label.RIGHT);
		Label l2=new Label("Password",Label.RIGHT);
		name=new TextField(20);
		pass=new TextField(20);
		pass.setEchoChar('*');
		b1=new Button("Login");
		add(l1);
		add(name);
		add(l2);
		add(pass);
		add(b1);
	
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		s2=name.getText();
		p2=pass.getText();
		if(s2.compareTo(s1)==0 &&(p2.compareTo(p1)==0)){
			msg="Login Sucessfull";
			name.setText(" ");
			pass.setText(" ");
			
		}
		else {
			msg="User name or password not correct";
			name.setText(" ");
			pass.setText(" ");
		}
		repaint();
	}
	public void paint(Graphics g) {
	
		g.drawString(msg,50,100);
		
	}
	

}
