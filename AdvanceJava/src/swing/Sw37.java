package swing;
import javax.swing.*;

public class Sw37 {
	JFrame f1;
	Sw37(){
		f1=new JFrame();
		JTextArea ta=new JTextArea("Java is an advance Programming Language");
		JPanel p1=new JPanel();
		p1.add(ta);
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JTabbedPane tp=new JTabbedPane();
		tp.setBounds(50,50,400,400);
		tp.add("main",p1);
		tp.add("visit",p2);
		tp.add("help",p3);
		f1.add(tp);
		f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		 new Sw37();
		

	}

}
