package swing;
import java.awt.Color;
import java.awt.color.*;
import javax.swing.*;
public class Sw19 {

	public static void main(String[] args) {
		JFrame frame =new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		
		frame.setSize(500, 600);
		frame.getContentPane().setBackground(Color.cyan);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

	}

}
