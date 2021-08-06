package applet;
import java.awt.*;
import java.applet.*;
//<Applet code='App6.class' width='600' height='600'></Applet>
public class App6 extends Applet{
	Checkbox r1,r2,r3,r4,r5,r6;
	CheckboxGroup c1,c2;
	public void init() {
		c1=new CheckboxGroup();
		c2=new CheckboxGroup();
		
		r1=new Checkbox("Ranchi",c1,false);
		add(r1);
		r2=new Checkbox("Bokaro",c1,false);
		add(r2);
		r3=new Checkbox("Dhanbad",c1,false);
		add(r3);
		r4=new Checkbox("Murga",c2,false);
		add(r4);
		r5=new Checkbox("Anda",c2,false);
		add(r5);
		r6=new Checkbox("Maach",c2,false);
		add(r6);
	}
	public void paint(Graphics g) {

	
		g.drawString("Radio Button", 10, 200);
	}

}
