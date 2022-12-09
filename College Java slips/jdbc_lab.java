import java.io.*;
import java.net.*;
import java.util.Date;

public class jdbc_lab{

	public static void main(String args[])throws IOException, UnknownHostException{

		Socket s = new Socket("localhost", 2222);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		InputStream is = s.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		boolean done = false;

		while(!done){

			System.out.println("DFsda");
			String msg = br.readLine();

			dos.writeUTF(msg);

			System.out.println("Server sayssss..........");

			dis.readUTF();

			s.close();
			dis.close();
			dos.close();
			}

		}
	}