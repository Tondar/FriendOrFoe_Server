package listener;

import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Distributor {

	public Distributor() {
		ExecutorService threadpool = Executors.newCachedThreadPool();
		
	}
	
	public void handleConnection ( Socket client ) {
		
	}
}
