package swing;
import javax.swing.*;

public class Sw9 {

	public static void main(String[] args) {
		JFrame f1=new JFrame();
		JTextField t1,t2;
		t1=new JTextField("Welcome in argus");
		t1.setEditable(false);
		t1.setBounds(60, 110, 200, 30);
		t2=new JTextField("Swing tutorial");
				t2.setBounds(60, 150, 200, 30);
		f1.add(t1);
		f1.add(t2);
		f1.setSize(600,600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
