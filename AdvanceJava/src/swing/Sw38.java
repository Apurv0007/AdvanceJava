package swing;
import javax.swing.*;

public class Sw38 {
	JFrame f1;
	Sw38(){
		f1=new JFrame();
		JSlider slider=new JSlider(JSlider.HORIZONTAL,0,100,0);
		slider.setMinorTickSpacing(2);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		f1.add(slider);
		f1.pack();
		f1.setSize(500, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new Sw38();

	}

}
