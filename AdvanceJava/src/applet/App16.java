package applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<Applet code="App16.class" width="300" height="400"></Applet>

public class App16 extends Applet implements MouseListener,MouseMotionListener
{

	int x=0,y=20;
	String msg="MoseEvents";
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
		setBackground(Color.black);
		setForeground(Color.red);
	}
	public void MouseEntered(MouseEvent m) {
		setBackground(Color.red);
		showStatus("Mouse Entered");
		repaint();
	}
	public void mouseExited(MouseEvent m) {
		setBackground(Color.black);
		showStatus("MouseExited");
		repaint();
	}

	public void mousePressed(MouseEvent m) {
		x=10;y=20;
		msg="NEC";
		setBackground(Color.green);
		repaint();
	}
	public void mouseReleased(MouseEvent m) {
		x=10;y=20;
		msg="Engineering";
		setBackground(Color.blue);
		repaint();
	
		
	}
	public void mouseMoved(MouseEvent m) {
		x=m.getX();
		y=m.getY();
		msg="Collage";
		setBackground(Color.white);
		showStatus("MouseMoved");
		repaint();
	}
	public void mouseDragged(MouseEvent m) {
		msg="CSE";
		setBackground(Color.yellow);
		showStatus("Mouse Moved"+m.getX()+" "+m.getY());
		repaint();
	}
	public void mouseClicked(MouseEvent m) {
		msg="Student";
		setBackground(Color.pink);
		showStatus("Mouse Clicked");
		repaint();
			}
	public void paint(Graphics g) {
		g.drawString(msg, x, y);
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
