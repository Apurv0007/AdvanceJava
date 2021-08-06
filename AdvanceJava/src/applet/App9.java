package applet;
import java .awt.*;
import java.applet.*;
//<Applet code='App9.class' width='600' height='600'></Applet>

public class App9 extends Applet {
	Choice os,browser;
	public void init() {
		os=new Choice();
		browser=new Choice();
		os.add("----Select O.S----");
		os.add("Window 98/xp");
		os.add("Window NT/20000");
		os.add("Window NT/20000");
		os.add("Solaries");
		os.add("Mac os");
		browser.add("----Select browser----");
		browser.add("Mozilaa");
		browser.add("Chrome");
		browser.add("Safari");
		browser.add("Brew");
		browser.add("IE 5.0");
		browser.add("NetScape 5x");
		add(os);
		add(browser);
	}

}
