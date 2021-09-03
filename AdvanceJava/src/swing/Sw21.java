package swing;
import javax.swing.*;
import java.awt.event.*;

public class Sw21  {
	JFrame f1;
	JLabel label;
	JButton b1;
	String s=" ",st=" ";
	Sw21(){
		f1 =new JFrame("Combo Box Example");
		label =new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400, 100);
		 b1=new JButton("Display");
		 b1.setBounds(200, 100, 75, 20);
		 String lang[]= {"select","C","C++","Java","Python"};
		  JComboBox cb =new JComboBox(lang);
		 cb.setBounds(50, 100, 90, 20);
		f1.add(cb);
		f1.add(label);
		f1.add(b1);
		f1.setSize(500, 600);
	    f1.setLayout(null);
	    f1.setVisible(true);
	    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    b1.addActionListener(new ActionListener() 
	    		{
	    	public void actionPerformed(ActionEvent e) {
	    		s=(String)cb.getItemAt(cb.getSelectedIndex());
	    		if(s.compareTo("select")==0) {
	    			st="Not Selected";
	    			label.setText(st);
	    		}
	    		else {
	    			st="You are Student of:"+st+"Language";
	    			label.setText(st);
	 }
	   	}   
	    	});
	            }

	public static void main(String[] args) {
		new Sw21();
		

	}

	

	}


