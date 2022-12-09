import java.net.*;
import java.io.*;
import java.util.Date;


// Notes : First Compile Server.java and then Client.java
public class Server
{
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		ServerSocket ss = new ServerSocket(2222);

		Socket s =  ss.accept();

		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		InputStream is = s.getInputStream();

		DataInputStream dis = new DataInputStream(is);

		OutputStream os = s.getOutputStream();

		DataOutputStream dos = new DataOutputStream(os);

		boolean done = false;

		while(!done){

			Date d = new Date();
			String clientMessage = dis.readUTF();

			System.out.println(clientMessage);

			System.out.println("Type 'END' to  end the conversation");

			String Message = d.toString();

			dos.writeUTF(Message);

			if(Message.equals ("end") || Message.equals("END")){
				done =true;
				}

			}
			s.close();
			dis.close();
			dos.close();
		}
}