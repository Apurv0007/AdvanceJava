package swing;
import javax.swing.*;

public class Sw33 {
	JMenu menu,submenu;
	JMenuItem i1,i2,i3,i4,i5;
	Sw33(){
		JFrame f1=new JFrame("Seperator Example");
		JMenuBar mb=new JMenuBar();
		menu=new JMenu("Menu");
		i1=new JMenuItem("Item 1");
		i2=new JMenuItem("Item 2");
		i3=new JMenuItem("Item 3");
		menu.add(i1);
		menu.addSeparator();
		menu.add(i2);
		menu.addSeparator();
		menu.add(i3);
		mb.add(menu);
		f1.setJMenuBar(mb);
		f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		new Sw33();
		
	}

}
