package swing;
import java.awt.event.*;
import javax.swing.*;

public class Sw6 {

	public static void main(String[] args) {
		JFrame f1=new JFrame("Button Example");
		JButton b1=new JButton("Click Me");
		JButton b2=new JButton();
		b1.setBounds(50, 100, 90, 30);
		b2.setBounds(50, 50, 250, 20);
		b1.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				f1.add(b2);
				b2.setText("Welcome in argus acadmey");
			}
				});
		f1.add(b1);
		f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
