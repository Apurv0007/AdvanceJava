package swing;
import javax.swing.*;
public class Sw17 {
	Sw17(){
	JFrame f1=new JFrame();
	JRadioButton r1=new JRadioButton("A) Male");
	JRadioButton r2=new JRadioButton("B)Female");
	r1.setBounds(150,50,100,30);
	r2.setBounds(150, 100, 100, 30);
	ButtonGroup bg=new ButtonGroup();
	bg.add(r1);
	bg.add(r2);
	f1.add(r1);
	f1.add(r2);
	f1.setSize(500, 600);
	f1.setLayout(null);
	f1.setVisible(true);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	}
	public static void main(String[] args) {
              new Sw17();		

	}

}
