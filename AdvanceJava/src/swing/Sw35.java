package swing;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Sw35 {
	JFrame f1;
	DefaultMutableTreeNode style,color,font,file ,save;
	Sw35(){
		f1=new JFrame();
		 style=new DefaultMutableTreeNode("Style");
		 color=new DefaultMutableTreeNode("Colour");
		 font=new DefaultMutableTreeNode("Font");
         file=new DefaultMutableTreeNode("file");
         save=new DefaultMutableTreeNode("Save");
		 
		 style.add(color);
		 style.add(font);
		 file.add(save);
		  DefaultMutableTreeNode red= new DefaultMutableTreeNode("red");
		  DefaultMutableTreeNode blue=new DefaultMutableTreeNode("Blue");
		  DefaultMutableTreeNode arial=new DefaultMutableTreeNode("arial");
		  DefaultMutableTreeNode times=new DefaultMutableTreeNode("Times");
		  DefaultMutableTreeNode  savers=new  DefaultMutableTreeNode ("Savers");
		  
		  color.add(red);
		  color.add(blue);
		  font.add(arial);
		  font.add(times);
		  save.add(savers);
		  JTree jt=new JTree(style);
		  JTree jt2=new JTree(file);
		  f1.add(jt);
		  f1.add(jt2);
		 
		 
		  f1.setSize(500, 600);
		  f1.setVisible(true);
		  f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
	}

	public static void main(String[] args) {
		new Sw35();
		

	}

}
