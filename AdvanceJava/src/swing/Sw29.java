package swing;
import javax.swing.*;
import java.awt.event.*;

public class Sw29   {
	Sw29(){
		JFrame f1=new JFrame("Scrollbar example");
		 final JLabel label=new JLabel();
			label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400, 100);
		 final JScrollBar s=new JScrollBar();
		s.setBounds(200, 200, 20, 200);
		f1.add(s);
		f1.add(label);
		f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.addAdjustmentListener(new AdjustmentListener ()
				{
				public void adjustmentValueChanged(AdjustmentEvent e) {
		
			label.setText("Vertical Scrollbar value is :"+s.getValue());
				}
		
	});
	}

	public static void main(String[] args) {
		new Sw29();

	}

}
