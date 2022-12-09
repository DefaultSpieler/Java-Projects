import java.lang.*;

public class MyThread extends Thread
{

	String s;
	int i;
	public MyThread(String ss,int ii){
		String s = ss;
		int i = ii;
		}

	public void run()
	{
		System.out.println(s + i);
	}

	public static void main(String args[])
	{
		MyThread t1 = new MyThread("FY", 1);
		t1.start();
		t1.join();

		MyThread t2 = new MyThread("SY", 1);
		t2.start();
		t2.join();
	}

}