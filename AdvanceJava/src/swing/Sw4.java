package swing;
import javax.swing.*;

public class Sw4 extends JFrame {
	void disp() {
		JButton b1=new JButton("Click ME");
		b1.setBounds(50, 100, 95, 30);
		add(b1);
		setSize(500, 600);
	    setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
	
		Sw4 ob=new Sw4();
		ob.disp();
	}

}
