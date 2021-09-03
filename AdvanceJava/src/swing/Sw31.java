package swing;
import javax.swing.*;
import java.awt.event.*;

public class Sw31 implements ActionListener{
	JFrame f1;
	JMenuBar mb;
	JMenu file,edit,help;
	JMenuItem cut,copy,paste,selectAll;
	JTextArea ta;
	Sw31(){
		f1=new JFrame();
		mb=new JMenuBar();
		file=new JMenu("File");
		edit=new JMenu("Edit");
		help=new JMenu("Help");
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		cut=new JMenuItem("cut");
		copy=new JMenuItem("copy");
		paste=new JMenuItem("Paste");
		selectAll=new JMenuItem("SelectAll");
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		ta=new JTextArea();
		ta.setBounds(5, 5, 360, 320);
		f1.add(mb);
		f1.add(ta);
		f1.setJMenuBar(mb);
		f1.setSize(500,600);
	    f1.setLayout(null);
	    f1.setVisible(true);
	    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==cut)
			ta.cut();
		if(e.getSource()==copy)
			ta.copy();
		if(e.getSource()==paste)
			ta.paste();
		if(e.getSource()==selectAll)
			ta.selectAll();
	}
	

	public static void main(String[] args) {
		new Sw31();

	}

}
