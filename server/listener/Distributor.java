package listener;

import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Distributor {

	private ExecutorService threadpool;
	
	public Distributor() {
		threadpool = Executors.newCachedThreadPool();
		
	}
	
	public void handleConnection ( Socket client ) {
		ConnectionHandler handler = new ConnectionHandler(client);
		threadpool.execute(handler);
	}
}
