package applet;


import java.awt.*;

import java.applet.*;
//<Applet code ='App1.class' width='600' height='600'></Applet>
public class App1 extends Applet {
	Font f1;
	Color c1;
	public void init() {
		f1=new Font("Verdand",Font.BOLD+Font.ITALIC,35);
		c1=new Color(200,120,10);
		setBackground(Color.cyan);
	}
	public void paint(Graphics g) {
		g.drawString("This is Normal Text", 20, 20);
		g.setColor(Color.red);
		g.drawString("This is Text color is red", 20, 50);
		g.setColor(c1);
		g.setFont(f1);
		g.drawString("This Text color is mix and size is 35",20,150);
		
	}

		

	

}
