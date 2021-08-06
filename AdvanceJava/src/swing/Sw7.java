package swing;
import javax.swing.*;

public class Sw7 {

	public static void main(String[] args) {
		
		JFrame f1=new JFrame();
		JLabel l1,l2;
		l1=new JLabel("Hi how are you");
		l1.setBounds(50, 50, 100, 30);
		l2=new JLabel("I am fine");
		l2.setBounds(100, 90, 100, 30);
		f1.add(l1);
		f1.add(l2);
		f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
