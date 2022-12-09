import java.net.*;
import java.io.*;

public class FClient{

	public static void main(String args[]) throws UnknownHostException, IOException{
			Socket s = new Socket("localhost", 2222);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			InputStream is = s.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);

			Boolean Done = true;

			String Msg = br.readLine();
			dos.writeUTF(Msg);

			String ServerMsg = dis.readUTF();
	System.out.println("Server says " + ServerMsg);
		}


}