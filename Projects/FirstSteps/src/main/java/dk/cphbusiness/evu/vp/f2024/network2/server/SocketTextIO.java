package dk.cphbusiness.evu.vp.f2024.network2.server;

import dk.cphbusiness.evu.vp.f2024.textiodefault.TextIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SocketTextIO implements TextIO
{
	private Socket socket;
	private DataOutputStream out;
	private DataInputStream in;

	public SocketTextIO(Socket socket) throws IOException
	{
		this.socket = socket;
		this.out = new DataOutputStream(socket.getOutputStream());
		this.in = new DataInputStream(socket.getInputStream());
	}

	@Override
	public void put(String str)
	{
		try
		{
			out.writeUTF("PUT");
			out.writeUTF(str);
		} catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public void clear()
	{
		try
		{
			out.writeUTF("CLEAR");
		} catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public String get()
	{
		try
		{
			out.writeUTF("GET");
			return in.readUTF();
		} catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	public void close()
	{
		try
		{
			out.writeUTF("CLOSE");
			out.close();
			in.close();
			socket.close();
		} catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}
}
