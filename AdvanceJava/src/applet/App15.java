package applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<Applet code="App15.class" width="300" height="400"></Applet>
public class App15 extends Applet implements KeyListener {
	int x=20,y=30;
	String msg="Key Event------>";
	public void init()
	{
		addKeyListener(this);
		setBackground(Color.green);
		setForeground(Color.blue);
	}
	public void keyPressed(KeyEvent k) 
	{
		showStatus("keyDown");
		setBackground(Color.red);
		setForeground(Color.blue);
	}
	public void keyReleased(KeyEvent k) {
		showStatus("key up");
		setBackground(Color.yellow);
		setForeground(Color.red);
	}
	public void keyTyped(KeyEvent k) {
		msg+=k.getKeyChar();
		repaint();
		}
	public void paint(Graphics g) {
		g.drawString(msg, x, y);
	}
	

}
