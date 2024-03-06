package dk.cphbusiness.evu.vp.f2024.network.chatserver;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

public class ServerClientThread implements Runnable
{
	private String name;
	private final Socket socket;
	private final DataInput input;
	private final DataOutput output;
	private final TextListener listener;

	public ServerClientThread(Socket socket, TextListener listener) throws IOException
	{
		this.socket = socket;
		this.listener = listener;
		input = new DataInputStream(socket.getInputStream());
		output = new DataOutputStream(socket.getOutputStream());
	}

	@Override
	public void run()
	{
		try
		{
			name = input.readUTF();
			while(true)
			{
				String text = input.readUTF();
				if("goodbye".equals(text.toLowerCase()))
				{
					listener.handleText(name + " is leaving the chat. Goodbye!");
					break;
				}
				listener.handleText(name + ": " + text);
			}
			socket.close();
		}
		catch (SocketException se)
		{
			listener.handleText("SocketException from " + name + ".");
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}

	}
}
