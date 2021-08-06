package applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<Applet code='App10.class' width='600' height='600'></Applet>


public class App10 extends Applet implements AdjustmentListener {

	Scrollbar scrollbar;
	TextField textfield;
	public void init() {
		scrollbar=new Scrollbar(Scrollbar.HORIZONTAL,1,1,0,100);
		add(scrollbar);
		scrollbar.addAdjustmentListener(this);
		textfield=new TextField(3);
		textfield.setEditable(true);
		add(textfield);
		
	}
	public void adjustmentValueChanged(AdjustmentEvent e) {
		textfield.setText(scrollbar.getValue()+" ");
	}
}
