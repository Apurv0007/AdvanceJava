package swing;
import javax.swing.*;

public class Sw22 {
	Sw22(){
		JFrame f1=new JFrame();
		String data[][]= {{"101","Kalia","c","6700"},
				          {"102","Dinesh","B","7800"},
				          {"103","Baita","B","7000"},
				          {"104","Aruci","A","9000"},
				                                  };
		String coloumn[]= {"Emp. No","Name","Grade","Salary"};
		JTable jt=new JTable(data,coloumn);
		jt.setBounds(30, 40, 200, 300);
		JScrollPane sp=new JScrollPane(jt);
		f1.add(sp);
		f1.setSize(400, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Sw22();
	

	}

}
