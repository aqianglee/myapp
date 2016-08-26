package client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import protocol.Protocol;

public class Portal {
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		String serverAddress = "127.0.0.1";
		Socket s = new Socket(serverAddress, 9090);
		// BufferedReader input = new BufferedReader(new
		// InputStreamReader(s.getInputStream()));
		// String answer = input.readLine();
		// System.out.println(answer);

		// ObjectInputStream in = new ObjectInputStream(s.getInputStream());
		// Protocol protocol = (Protocol) in.readObject();
		// System.out.println(protocol.toString());
		// s.close();
		ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
		Protocol protocol = new Protocol();
		protocol.setName("abc");
		protocol.setVersion("1.0");
		out.writeObject(protocol);
	}
}
