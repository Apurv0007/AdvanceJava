package swing;
import javax.swing.*;
import javax.swing.event.*;
public class Sw39 {
Sw39(){
	JFrame f1=new JFrame("Spinner Example");
	final JLabel label=new JLabel();
	label.setHorizontalAlignment(JLabel.CENTER);
	label.setSize(250, 100);
	SpinnerNumberModel value=new SpinnerNumberModel(5,0,100,1);
	JSpinner spinner=new JSpinner(value);
	spinner.setBounds(100, 100, 50, 30);
	f1.add(spinner);
	f1.add(label);
	f1.setSize(500, 600);
	f1.setLayout(null);
	f1.setVisible(true);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	spinner.addChangeListener(new ChangeListener() {
		public void stateChanged(ChangeEvent e) {
			label.setText("Value:"+((JSpinner)e.getSource()).getValue());
		}
	});
}
	public static void main(String[] args) {
		new Sw39();
	}

}
