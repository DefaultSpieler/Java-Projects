import java.io.*;
import java.net.*;

public class simpleChatServer{
	public static void main(String[] args)throws UnknownHostException, IOException{

		ServerSocket ss = new ServerSocket(2222);

		Socket s = ss.accept();

		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

		DataInputStream dis = new DataInputStream(s.getInputStream());

		DataOutputStream dos = new DataOutputStream(s.getOutputStream());

		boolean done = true;

		while(done){

			System.out.println("Client Says");
			String cmsg = dis.readUTF();
			System.out.println(cmsg);

			System.out.println("Enter your message that is to be sent to the Client");
			String msg = br.readLine();

			dos.writeUTF(msg);




			if (msg.equals("BYE") || msg.equals("bye")){
				done = false;
				}
			}
		}
	}