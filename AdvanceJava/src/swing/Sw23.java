package swing;
import javax.swing.*;


public class Sw23 {
	Sw23(){
	JFrame f1=new JFrame();
	DefaultListModel<String> l1=new DefaultListModel<>();
	l1.addElement("Ranchi");
	l1.addElement("chatra");
	l1.addElement("bokaro");
	l1.addElement("khunti");
	JList<String> list=new JList<>(l1);
	list.setBounds(100,100,75,75);
	f1.add(list);
	f1.setSize(400, 400);
	f1.setLayout(null);
	f1.setVisible(true);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}
	public static void main(String[] args) {
		new Sw23();
	

	}

}
