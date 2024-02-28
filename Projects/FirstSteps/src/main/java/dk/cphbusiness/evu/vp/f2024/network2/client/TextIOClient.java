package dk.cphbusiness.evu.vp.f2024.network2.client;

import dk.cphbusiness.evu.vp.f2024.textiodefault.SystemTextIOImpl;
import dk.cphbusiness.evu.vp.f2024.textiodefault.TextIO;

import java.io.*;
import java.net.Socket;

public class TextIOClient
{
	private TextIO textIO;

	public TextIOClient(TextIO textIO)
	{
		this.textIO = textIO;
	}

	public void connectTo(String IP, int port) throws IOException
	{
		Socket clientSocket = new Socket(IP, port);
		DataInputStream in = new DataInputStream(clientSocket.getInputStream());
		DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
		boolean closed = false;
		while(!closed)
		{
			String cmd = in.readUTF();
			switch(cmd)
			{
				case "PUT" :
					String outStr = in.readUTF();
					textIO.put(outStr);
					break;
				case "GET" :
					String inStr = textIO.get();
					out.writeUTF(inStr);
					break;
				case "CLEAR" :
					textIO.clear();
					break;
				case "CLOSE" :
					textIO.put("\n\nGoodbye!\n\n");
					in.close();
					out.close();
					clientSocket.close();
					closed = true;
					break;
				default:
					throw new RuntimeException("Unknown command: " + cmd);
			}
		}
	}

	public static void main(String[] args) throws IOException
	{
		TextIO io = new SystemTextIOImpl();
		TextIOClient client = new TextIOClient(io);
		client.connectTo("172.29.160.1", 2323);
	}
}
