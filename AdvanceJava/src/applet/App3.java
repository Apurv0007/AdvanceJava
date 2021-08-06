package applet;
import java.awt.*;
import java.applet.*;
//<Applet code='App3.class' width='600' height='600'></Applet>

public class App3 extends Applet implements Runnable {
	Thread t1;
	int y;
	public void init() {
		t1=new Thread(this);
		t1.start();
		y=0;
	}
	public void run() {
		while(true)
		{
			if(y>600)
			{
				y=0;
			}
			y=y+20;
			repaint();
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException  e1) {
				System.out.println(e1);
			}
		}
	}
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(20, y, 20, 20);
		g.setColor(Color.blue);
		g.fillOval(500, 600-y, 20, 20);
		g.setColor(Color.green);
		g.fillOval(y,20	, 20, 20);
		g.setColor(Color.yellow);
		g.fillOval(y+20, y+20, y+20, y+20);
	}

}
