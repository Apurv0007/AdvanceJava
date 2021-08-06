package applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<Applet code='App7.class' width='600' height='600'></Applet>
public class App7 extends Applet implements ItemListener {
	Checkbox ch1,ch2,ch3,ch4;
	TextField t1;
	public void init() {
		ch1=new Checkbox("1");
		add(ch1);
		ch1.addItemListener(this);
		ch2=new Checkbox("2");
		add(ch2);
		ch2.addItemListener(this);
		ch3=new Checkbox("3");
		add(ch3);
		ch3.addItemListener(this);
		ch4=new Checkbox("4");
		add(ch4);
		ch4.addItemListener(this);
		t1=new TextField(50);
		add(t1);
	}
	public void itemStateChanged(ItemEvent e) {
		String s1=((Checkbox)e.getItemSelectable()).getLabel();
		t1.setText("Check Box "+s1+" is Checked");
	}
}
