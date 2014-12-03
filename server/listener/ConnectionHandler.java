package listener;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ConnectionHandler implements Runnable {
	
	private Socket client;
	
	public ConnectionHandler(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		Scanner in = null;
		try {
			in = new Scanner(client.getInputStream());
		} catch (IOException e) {
			// TODO Automatisch generierter Erfassungsblock
			e.printStackTrace();
		}
		
		System.out.println(in.next());
	}

}
