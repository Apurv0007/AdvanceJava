package swing;
import javax.swing.*;
import java.awt.*;

public class Sw48 {
	Sw48(){
		JFrame f1=new JFrame("hiiiii");
		Image icon=Toolkit.getDefaultToolkit().getImage("a1.bmp");
		f1.setIconImage(icon);
		f1.setSize(600, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Sw48 ob=new Sw48();
		

	}

}
