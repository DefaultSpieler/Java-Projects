import java.io.*;
import java.net.*;

public class simpleChat{
	public static void main(String[] args)throws UnknownHostException, IOException{

		Socket s = new Socket("localhost", 2222);

		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

		DataInputStream dis = new DataInputStream(s.getInputStream());

		DataOutputStream dos = new DataOutputStream(s.getOutputStream());

		boolean done = true;

		while(done){
			System.out.println("Enter your message that is to be sent to the server");
			String msg = br.readLine();

			dos.writeUTF(msg);

			System.out.println("Server Says");
			String cmsg = dis.readUTF();
			System.out.println(cmsg);


			if (msg.equals("BYE") || msg.equals("bye")){
				done = false;
				}
			}
		}
	}