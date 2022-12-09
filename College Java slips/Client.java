import java.net.*;
import java.io.*;
import java.util.Date;

public class Client
{
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		Socket s = new Socket("localhost", 2222);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		InputStream is = s.getInputStream();

		DataInputStream dis = new DataInputStream(is);

		OutputStream os = s.getOutputStream();

		DataOutputStream dos = new DataOutputStream(os);

		boolean done = false;

		while(!done)
		{
			System.out.println("Enter Message, type 'END' to end the chat");

			String message = br.readLine();

			dos.writeUTF(message);

			System.out.println("Waiting for Server");

			String ServerMessage = dis.readUTF();

			System.out.println("Server says " + ServerMessage);

			if(message.equals("end") || message.equals("END"))
				done = true;
		}
		s.close();
		dis.close();
		dos.close();
	}
}