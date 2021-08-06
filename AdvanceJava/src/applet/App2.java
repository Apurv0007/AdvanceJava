package applet;
import java.awt.*;
import java.applet.*;
//<Applet code='App2.class' width='600' height='600'></Applet>

public class App2 extends Applet {
	public void init() {
		setBackground(Color.pink);
	}
	public void paint(Graphics g) {
		g.drawLine(10, 10, 100, 10);
		g.drawLine(20, 20, 20, 100);
		g.setColor(Color.red);
		g.fillOval(120, 50, 60, 60);
		g.setColor(Color.yellow);
		g.fillOval(125, 55, 20, 20);
		g.setColor(Color.black);
		g.clearRect(190, 50, 60, 60);
		g.setColor(Color.blue);
		g.fillRect(260, 50, 60, 60);
		g.setColor(Color.yellow);
		g.fillRoundRect(330, 50, 60, 60, 30, 30);
	}

}
