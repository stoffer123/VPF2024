package dk.cphbusiness.evu.vp.f2024.network.chatserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread implements Runnable
{
	@Override
	public void run()
	{
		try
		{
			TextListener tl = new DummyTextListener();
			ServerSocket serverSocket = new ServerSocket(2323);
			while(true)
			{
				Socket socket = serverSocket.accept();
				new Thread(new ServerClientThread(socket, tl)).start();
			}
		} catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args)
	{
		ServerThread thread = new ServerThread();
		thread.run();
	}
}
