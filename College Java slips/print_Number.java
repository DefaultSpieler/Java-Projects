import java.io.*;

public class print_Number extends Thread
{
	public void run()
	{
		try{


			  for(int i=1;i<101;i++)
			  {
				 System.out.println(i);

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
	print_Number t=new print_Number();
	t.start();
}
}