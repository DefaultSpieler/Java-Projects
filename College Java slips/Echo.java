import java.net.*;
import java.io.*;

public class Echo
{
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		ServerSocket ss = new ServerSocket(2222);

		Socket s =  ss.accept();

		InputStream is = s.getInputStream();

		DataInputStream dis = new DataInputStream(is);

		OutputStream os = s.getOutputStream();

		DataOutputStream dos = new DataOutputStream(os);

		boolean done = true;

		while(done){
			String clientMessage = dis.readUTF();

			System.out.println(clientMessage);

			System.out.println("Client says : " + clientMessage);
			dos.writeUTF(clientMessage);

			if(clientMessage.equals ("end") || clientMessage.equals("END")){
				done = false;
				}

			}
			s.close();
			dis.close();
			dos.close();
		}
}