package applet;
import java.awt.*;
import java.applet.*;
//<Applet code='App5.class' width='600' height='600'></Applet>
public class App5 extends Applet {
	Checkbox rnc ,bok, dhn, har;
	public void init() {
		
		rnc=new Checkbox("Ranchi",true);
		add(rnc);
		bok=new Checkbox("Bokaro");
		add(bok);
		dhn=new Checkbox("Dhanbad");
		add(dhn);
		har=new Checkbox("Hazaribagh");
		add(har);
	}
	public void paint(Graphics g) {
		g.drawString("Check Box", 10, 1000);
		
	}

}
