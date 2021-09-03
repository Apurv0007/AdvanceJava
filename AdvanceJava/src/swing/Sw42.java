package swing;
import javax.swing.*;

import java.awt.event.*;
import java.io.*;


public class Sw42 extends JFrame implements ActionListener {
	JMenuBar mb;
	JMenu file;
	JMenuItem open;
	JTextArea ta;
	Sw42()
	{
		open= new JMenuItem("open File");
		open.addActionListener(this);
		file=new JMenu("File");
		file.add(open);
		mb=new JMenuBar();
		mb.setBounds(0, 0, 800, 20);
		mb.add(file);
		ta=new JTextArea(800,800);
		add(mb);
		add(ta);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==open) {
			JFileChooser fc=new JFileChooser();
			int i=fc.showOpenDialog(this);
			if(i==JFileChooser.APPROVE_OPTION) 
			{
				File f=fc.getSelectedFile();
				String filepath=f.getPath();
				try {
				BufferedReader br=new BufferedReader( new FileReader(filepath));
				String s1="",s2="";
				while((s1=br.readLine())!=null) {
					s2+=s1+"\n";
				}
				ta.setText(s2);
				br.close();
				}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
		}
	}
}
	public static void main(String[] args) {
		Sw42 ob=new Sw42();
		ob.setSize(800, 800);
		ob.setLayout(null);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
