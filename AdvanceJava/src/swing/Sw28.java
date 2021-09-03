//ScrollBar
package swing;
import javax.swing.*;

public class Sw28 {
	Sw28(){
		JFrame f1=new JFrame("Scroolbar example");
		JScrollBar s1=new JScrollBar();
		s1.setBounds(100, 100, 30, 100);
		f1.add(s1);
		f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Sw28();
		

	}

}
