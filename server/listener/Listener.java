package listener;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Listener implements Runnable{

	@Override
	public void run() {
		Distributor distributor = new Distributor();
		
		ServerSocket server = null;
		try {
			server = new ServerSocket(4224);
		} catch (IOException e) {
			// TODO Automatisch generierter Erfassungsblock
			e.printStackTrace();
		}
		
		while(true) {
			Socket client = null;
			
			try {
				client = server.accept();
				distributor.handleConnection(client);	
			} catch (IOException e) {
				// TODO handle exception
				e.printStackTrace();
			} finally {
				if (client != null) {
					try {
						server.close();
					} catch (IOException e) {
						
					}
				}
			}
			
		}
		
	}
	
	
}
