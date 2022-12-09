import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;
import java.util.*;

//server mein while loop nhi chahiye

public class timedisp extends JFrame implements ActionListener, Runnable
{
	Button b1, b2, b3, b4;
	Panel p;
	Date d;
	Thread t;
	String s;
	TextField tf;

	public timedisp()
	{
		t = new Thread(this);
		p = new Panel();
		b1 = new Button("START TIME");
		tf = new TextField(30);
		add(p);
		p.add(b1);
		add(tf);
		b1.addActionListener(this);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			t.start();
		}
	}

	public void run()
	{
		try
		{
			while(true)
			{
				d = new Date();
				s = d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();
				tf.setText(s);
				t.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String args[])
	{
		new timedisp();
	}
}