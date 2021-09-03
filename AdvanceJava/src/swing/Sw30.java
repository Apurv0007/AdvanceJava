package swing;
import javax.swing.*;

public class Sw30 {
	JMenu menu,menu2,submenu,item3;
	JMenuItem i1,i2,i3,i4,i5;
	Sw30(){
		JFrame f1=new JFrame("Menu and Menu item Example");
		JMenuBar mb=new JMenuBar();
		menu=new JMenu("Menu");
		
		
		
		submenu=new JMenu("SubMenu");
		item3=new JMenu("Item 3");
		i1=new JMenuItem("Item1");
		i2=new JMenuItem("Item2");
		//i3=new JMenuItem("Item3");
		i4=new JMenuItem("Item4");
		i5=new JMenuItem("Item5");
		menu.add(i1);
		menu.add(i2);
		//menu.add(i3);
		item3.add(i4);
		//item3.add(i5);
		//submenu.add(i4)
		submenu.add(i5);
		menu.add(item3);
		menu.add(submenu);
		mb.add(menu);
		
		f1.setJMenuBar(mb);
		
		f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		new Sw30();

	}

}
