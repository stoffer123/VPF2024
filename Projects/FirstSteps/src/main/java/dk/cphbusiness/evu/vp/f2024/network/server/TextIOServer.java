package dk.cphbusiness.evu.vp.f2024.network.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TextIOServer implements Runnable
{
	private final int port;
	private final TextIOSocketListener listener;
	private ServerSocket serverSocket;
	private volatile boolean running;

	public TextIOServer(int port, TextIOSocketListener listener)
	{
		this.port = port;
		this.listener = listener;
		this.running = false;
		this.serverSocket = null;
	}

	@Override
	public void run()
	{
		try
		{
			this.serverSocket = new ServerSocket(port);
			running = true;
			System.out.println("Server starting!");
			while(running)
			{
				try
				{
					Socket socket = serverSocket.accept();
					listener.onNewConnection(new SocketTextIO(socket));
				}
				catch(SocketException e)
				{
					System.out.println("accept threw a SocketException: " + e);
				}
			}
			System.out.println("Server stopped!");
		} catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	public void stop() throws IOException
	{
		System.out.println("stop() called!");
		running = false;
		serverSocket.close();
	}

}
