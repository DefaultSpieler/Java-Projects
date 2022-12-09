import java.io.*;
import java.net.*;
import java.util.Date;

public class jdbc_server{

	public static void main(String args[])throws IOException, UnknownHostException{

		ServerSocket ss= new ServerSocket(2222);
		Socket s = ss.accept();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		InputStream is = s.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		boolean done = false;

		while(!done){

			Date d = new Date();

			dos.writeUTF(d.toString());

			System.out.println("Client sayssss..........");

			dis.readUTF();

			s.close();
			dis.close();
			dos.close();
			}

		}
	}