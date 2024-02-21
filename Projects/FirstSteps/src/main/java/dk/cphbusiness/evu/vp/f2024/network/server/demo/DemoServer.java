package dk.cphbusiness.evu.vp.f2024.network.server.demo;

import dk.cphbusiness.evu.vp.f2024.network.server.SocketTextIO;
import dk.cphbusiness.evu.vp.f2024.network.server.TextIOServer;
import dk.cphbusiness.evu.vp.f2024.network.server.TextIOSocketListener;

import java.io.IOException;

public class DemoServer implements TextIOSocketListener
{
	@Override
	public void onNewConnection(SocketTextIO client)
	{
		Thread t = new Thread(new DemoSession(client));
		t.start();
	}

	public static void main(String[] args) throws InterruptedException, IOException
	{
		DemoServer listener = new DemoServer();
		TextIOServer server = new TextIOServer(2323, listener);
		Thread serverThread = new Thread(server);
		serverThread.start();
		/*

		for(int i = 1; i < 10; ++i)
		{
			Thread.sleep(1000);
			System.out.println(i);
		}
		System.out.println("Stopping server...");
		server.stop();
		System.out.println("GoodBye!");

		 */
	}
}
