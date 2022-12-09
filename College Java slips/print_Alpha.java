import java.io.*;

public class print_Alpha extends Thread
{
	public void run()
	{
		try{
		      int ch=65;

			  for(int i=1;i<50;i++)
			  {
				 System.out.println(i);
				 ch++;
				 Thread.sleep(2000);
			  }

			}
		 catch(Exception e)
		    {
			    System.out.println(e);
			}

}

public static void main(String args[]) throws IOException
{
	print_Alpha t=new print_Alpha();
	t.start();
}
}