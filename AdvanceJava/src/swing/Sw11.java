package swing;
import javax.swing.*;
import java.awt.event.*;

public class Sw11 implements ActionListener{
	JLabel l1,l2;
	JTextArea area;
	JButton b1;
	Sw11(){
		JFrame f1=new JFrame();
		l1=new JLabel();
		l1.setBounds(85,25,100,30);
		l2=new JLabel();
		l2.setBounds(230,25,100,30);
		area=new JTextArea();
		area.setBounds(85,75,250,200);
	    b1=new JButton("Count");
	    b1.setBounds(100,300,120,30);
	    b1.addActionListener(this);
	    f1.add(l1);
	    f1.add(l2);
	    f1.add(area);
	    f1.add(b1);
	    f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		String text=area.getText();
		String words[]=text.split("\\s");
		l1.setText("Words:"+words.length);
		l2.setText("Character :"+text.length());
	}
	

	public static void main(String[] args) {
		new Sw11();


	}

}
