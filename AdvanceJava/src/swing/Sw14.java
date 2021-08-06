package swing;
import javax.swing.*;

public class Sw14 {
	Sw14(){
		JFrame f1=new JFrame("Check Box");
		JCheckBox c1=new JCheckBox("Python");
		c1.setBounds(150,100,100,50);
		JCheckBox c2=new JCheckBox("Java",true);
		c2.setBounds(150,150,100,50);
		f1.add(c1);
		f1.add(c2);
		f1.setSize(500, 600);
		f1.setLayout(null);f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Sw14();

	}

}
