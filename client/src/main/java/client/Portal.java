package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Portal {
	public static void main(String[] args) throws UnknownHostException, IOException {
		String serverAddress = "127.0.0.1";
		Socket s = new Socket(serverAddress, 9090);
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String answer = input.readLine();
		System.out.println(answer);
		s.close();
	}
}
