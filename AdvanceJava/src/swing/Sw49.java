package swing;
import java.awt.FlowLayout;
import javax.swing.*;

public class Sw49 {
	//private static final long serialVersionUID=1;
	private static void createAndShowGUI() {
		final JFrame frame=new JFrame("Scroll Pane Examole");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout());
		JTextArea textArea=new JTextArea(40,40);
		JScrollPane scrollableTextArea=new JScrollPane(textArea);
		scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(scrollableTextArea);
		
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable()
				{
			public void run() {
				createAndShowGUI();
			}
				});
		

	}

}
