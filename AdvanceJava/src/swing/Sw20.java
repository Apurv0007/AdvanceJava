package swing;
import javax.swing.*;

public class Sw20 {
	Sw20(){
		JFrame f1=new JFrame();
		String st[]= {"--select--","ranchi","bokaro","dhanbad",};
		JComboBox c=new JComboBox(st);
		c.setBounds(100,100,150, 100);
		f1.add(c);
		f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
	   new Sw20();

	}

}
