package dk.cphbusiness.evu.vp.f2024.network.chatserver;

import dk.cphbusiness.evu.vp.f2024.textio.SystemTextIOImpl;
import dk.cphbusiness.evu.vp.f2024.textio.TextIO;

import java.io.*;
import java.net.Socket;

public class ClientClientThread implements Runnable
{
	private final TextIO io;
	private final Socket socket;
	private final DataInput input;
	private final DataOutput output;

	public ClientClientThread(TextIO io, Socket socket) throws IOException
	{
		this.io = io;
		this.socket = socket;
		input = new DataInputStream(socket.getInputStream());
		output = new DataOutputStream(socket.getOutputStream());
	}

	@Override
	public void run()
	{
		try
		{
			io.put("Please enter your name: ");
			String name = io.get();
			output.writeUTF(name);
			while(true)
			{
				String text = io.get();
				output.writeUTF(text);
				if("goodbye".equals(text.toLowerCase()))
				{
					break;
				}
			}
			socket.close();
		} catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) throws IOException
	{
		String ip = "localhost";
		int port = 2323;
		TextIO io = new SystemTextIOImpl();
		Socket socket = new Socket(ip, port);
		ClientClientThread thread = new ClientClientThread(io, socket);
		thread.run();
	}
}
