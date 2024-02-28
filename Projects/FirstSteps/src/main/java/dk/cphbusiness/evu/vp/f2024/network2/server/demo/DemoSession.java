package dk.cphbusiness.evu.vp.f2024.network2.server.demo;

import dk.cphbusiness.evu.vp.f2024.network2.server.SocketTextIO;

public class DemoSession implements Runnable
{
	private final SocketTextIO socketTextIO;


	public DemoSession(SocketTextIO socketTextIO)
	{
		this.socketTextIO = socketTextIO;
	}


	@Override
	public void run()
	{
		socketTextIO.put("Please enter yout name: ");
		String name = socketTextIO.get();
		socketTextIO.put("Hello " + name + ", thanks for helping!");
		socketTextIO.close();
	}
}
