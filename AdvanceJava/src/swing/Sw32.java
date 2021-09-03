package swing;
import javax.swing.*;
import java.awt.event.*;

public class Sw32 {
	Sw32(){
		final JFrame f1=new JFrame("popup menu example");
		JPopupMenu popupmenu=new JPopupMenu("edit");
		JMenuItem cut=new JMenuItem("Cut");
		JMenuItem copy=new JMenuItem("Copy");
		JMenuItem paste=new JMenuItem("paste");
		popupmenu.add(cut);
		popupmenu.add(copy);
		popupmenu.add(paste);
		f1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				popupmenu.show(f1,e.getX(),e.getY());
			}
		});
		f1.add(popupmenu);
		f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 }	
	public static void main(String[] args) {
	new Sw32();

	}

}
