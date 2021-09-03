package swing;
import javax.swing.*;

public class Sw26 {
	Sw26(){
		JFrame f1=new JFrame();
	String name=	JOptionPane.showInputDialog(f1, "Enter your name");
		JOptionPane.showConfirmDialog(f1, "Hello "+name);
	}

	public static void main(String[] args) {
		new Sw26();

	}

}
