package applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<Applet code='App11.class' width='600' height='600'></Applet>

public class App11 extends Applet implements ItemListener,ActionListener {
	TextField t1;
	Label l1;
	Button b1;
	String s;
	int m;
	Choice language=null;
	public void init() {
		setFont(new Font("SansSerif",Font.BOLD,20));
		l1=new Label("Which language we are Studing");
		add(l1);
		language=new Choice();
		language.add("Select");
		language.add("Java");
		language.add("C++");
		language.add("VB");
		language.add("Perl");
		add(language);
		language.addItemListener(this);
		b1=new Button("Submit");
		add(b1);
		b1.addActionListener(this);
		t1=new TextField(20);
		add(t1);
	}
	public void itemStateChanged(ItemEvent e) {
		s=language.getSelectedItem();
		if(s.equals("Java")) {
			m=m+5;
		}
		else {
			m=0;
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			t1.setText(String.valueOf(m));
		}
	}

}
