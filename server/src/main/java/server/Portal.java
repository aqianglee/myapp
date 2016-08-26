package server;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import protocol.Protocol;

public class Portal {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("app");
		if (!file.isDirectory()) {
			file.mkdir();
		}
		System.out.println(file.getAbsolutePath());

		ServerSocket listener = new ServerSocket(9090);
		try {
			while (true) {
				Socket socket = listener.accept();
				try {
					// PrintWriter out = new
					// PrintWriter(socket.getOutputStream(), true);
					// out.println(new Date().toString());
					// ObjectOutputStream out = new
					// ObjectOutputStream(socket.getOutputStream());
					// Protocol protocol = new Protocol();
					// protocol.setName("abc");
					// protocol.setVersion("1.0");
					// out.writeObject(protocol);

					ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
					Protocol protocol = (Protocol) in.readObject();
					System.out.println(protocol.toString());
					socket.close();
				} finally {
					socket.close();
				}
			}
		} finally {
			listener.close();
		}
	}
}
