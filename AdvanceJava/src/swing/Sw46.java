package swing;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

public class Sw46 {
	JFrame myframe;

	public static void main(String[] args) {
		new Sw46().test();
		

	}
	private void test() {
		myframe=new JFrame("JEditorPaneTest");
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setSize(600, 600);
		JEditorPane myPane=new JEditorPane();
		myPane.setContentType("text/html");
		myPane.setText("<h1>Sleeping</h1><p>Sleeping is necessary for a	healthy body. But sleeping in unnecessary times may <font color='red'><b>spoil</b></font> our health, wealth and studies. Doctors advise that the sleeping at improper timings may lead for obesity during the students days.</p>");
	    myframe.setContentPane(myPane);
	    myframe.setVisible(true);
	}

}
