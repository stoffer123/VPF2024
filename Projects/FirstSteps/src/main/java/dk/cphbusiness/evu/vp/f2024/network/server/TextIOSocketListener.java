package dk.cphbusiness.evu.vp.f2024.network.server;

import dk.cphbusiness.evu.vp.f2024.network.server.SocketTextIO;

public interface TextIOSocketListener
{
	void onNewConnection(SocketTextIO client);
}
