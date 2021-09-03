package swing;
import javax.swing.*;

public class Sw34  {
	JFrame f1;
	JProgressBar jb;
	int i=0,num=0;
	Sw34(){
		f1=new JFrame();
		jb=new JProgressBar(0,2000);
		jb.setBounds(40, 40, 260, 30);
		jb.setValue(0);
		jb.setStringPainted(true);
		f1.add(jb);
		f1.setSize(400, 500);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void iterate() {
		while(i<=2000) {
			jb.setValue(i);
			i=i+20;
			try
			{
				Thread.sleep(150);
			}catch(Exception e) {
				System.out.println(e);
				}
			}
	}
	public static void main(String[] args) {
		Sw34 p=new Sw34();
		p.iterate();
		

	}

}
