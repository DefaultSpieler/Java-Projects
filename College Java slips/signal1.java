import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.applet.*;

public class signal1 extends Applet implements ActionListener,Runnable
{

		Button b1,b2;
		Panel p;
		Thread t;
		Boolean redflag,greenflag,yellowflag;

		public signal1()
		{
			t=new Thread(this);

			p=new Panel();

			b1=new Button("START SIGNAL");
			b2=new Button("STOP SIGNAL");

			redflag=true;
			greenflag=false;
			yellowflag=false;


			add(p);

			p.add(b1);
			p.add(b2);

		}

		public void start()
		{

			b1.addActionListener(this);
			b2.addActionListener(this);

		}

		public void actionPerformed(ActionEvent ae)
		{

			if (ae.getSource()==b1)
			{
				t.start();

			}
			if (ae.getSource()==b2)
			{
				t.stop();

			}

		}

		public void run()
		{
			try
			{
				while (true)
				{

					if (redflag)
					{
						greenflag=true;
						redflag=false;
					    yellowflag=false;


					}

					else

						if (yellowflag)
						{
							redflag=true;
							greenflag=false;
							yellowflag=false;


						}

						else

							if (greenflag)
							{
								redflag=false;
								greenflag=false;
								yellowflag=true;
							}




					repaint();
					t.sleep(1000);

				}

			}
			catch(Exception e)
			{
					System.out.print(e);

			}
		}

			public void paint(Graphics g)
			{

				try
				{
					if (redflag)
					{
						g.setColor(Color.RED);
						g.fillOval(50,70,50,50);

					}


					if (greenflag)
					{
						g.setColor(Color.GREEN);
						g.fillOval(50,140,50,50);
					}

					if (yellowflag)
					{
						g.setColor(Color.YELLOW);
						g.fillOval(50,200,50,50);
					}



				}
				catch(Exception e)
				{
					System.out.println(e);

				}
			}

	}