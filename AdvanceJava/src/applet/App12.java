package applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<Applet code ="App12.class" width="600" height="600"></Applet>

public class App12 extends Applet implements ActionListener {
	Button b1;
	frame menuwindow;
	public void init()
	{
		b1=new Button("Display then menu window");
		add(b1);
		b1.addActionListener(this);
		menuwindow = new frame("Menu");
		menuwindow.setSize(200,200);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			menuwindow.setVisible(true);
		}
	}
}
class frame extends Frame implements ActionListener
{
	Menu menu;
	MenuBar menubar;
	MenuItem menuitem1,menuitem2,menuitem3;
	Label label;
	frame(String title)
	{
		super(title);
		label= new Label("Hello from java");
		setLayout(new GridLayout(1,1));
		add(label);
		menubar= new MenuBar();
		menu = new Menu("File");
		menuitem1=new MenuItem("Item 1");
		menu.add(menuitem1);
		menuitem1.addActionListener(this);
		
		menuitem2=new MenuItem("Item 2");
		menu.add(menuitem2);
		menuitem2.addActionListener(this);
		
		menuitem3=new MenuItem("Item 3");
		menu.add(menuitem3);
		menuitem3.addActionListener(this);
		menubar.add(menu);
		setMenuBar(menubar);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				setVisible(false);
			}
			}
		);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==menuitem1)
		{
			label.setText("you chose item 1");
		}
		if(e.getSource()==menuitem2)
		{
			label.setText("you chose item 2");
		}
		if(e.getSource()==menuitem3)
		{
			label.setText("you chose item 3");
		}
		
	}

}
