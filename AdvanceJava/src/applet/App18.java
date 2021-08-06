package applet;
import java.awt.*;

import java.applet.*;
//<Applet code="App18.class" width="400" height="400"></Applet>

public class App18 extends Applet	{
	Image img;
	public void init() {
		img=getImage(getDocumentBase(),"img.PNG");
	}
	public void paint(Graphics g) {
		g.drawImage(img,20,20,this);
		
	}
}

