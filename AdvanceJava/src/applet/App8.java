package applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<Applet code='App8.class' width='600' height='600'></Applet>

public class App8 extends Applet implements ItemListener, ActionListener {
	Checkbox r1,r2,r3,r4;
	CheckboxGroup radios;
	TextField t1;
	Label l1;
	Button b1;
	String s11;
	public void init() {
		l1=new Label("India 1st Prime Minister");
		add(l1);
		radios=new CheckboxGroup();
		r1=new Checkbox("Atal Bihari",false ,radios);
		add(r1);
		r1.addItemListener(this);
		r2=new Checkbox("Jawahar chacha",false ,radios);
		add(r2);
		r2.addItemListener(this);
		r3=new Checkbox("Narendra Modi",false ,radios);
		add(r3);
		r3.addItemListener(this);
		r4=new Checkbox("Parthibha patil",false ,radios);
		add(r4);
		r4.addItemListener(this);
		b1=new Button("Submit");
		add(b1);
		b1.addActionListener(this);
		t1=new TextField(20);
		add(t1);
	}
	public void itemStateChanged(ItemEvent e) {
		s11=((Checkbox)e.getItemSelectable()).getLabel();
		
	}
	public void actionPerformed(ActionEvent e) {
		String s=s11;
		int m=0;
		if(e.getSource()==b1) {
			if((s.compareTo("Jawahar chacha"))==0) {
				m=m+5;
			}
			t1.setText(String.valueOf(m));
		}
	}

}
