package swing;
import javax.swing.*;

public class Sw5 {
	Sw5(){
		JFrame f1=new JFrame("Button Example");
		JButton b1=new JButton(new ImageIcon("img.PNG"));
		b1.setBounds(30, 80, 100, 40);
		f1.add(b1);
		f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
	}

	public static void main(String[] args) {
	 
		new Sw5();

	}

}
