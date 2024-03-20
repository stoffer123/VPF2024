package dungeoncrawler.impl;

import dungeoncrawler.Location;
import dungeoncrawler.Portal;

public class PortalImpl implements Portal
{
	private final String portalName;
	private final Location destination;

	public PortalImpl(String portalName, Location destination)
	{
		this.portalName = portalName;
		this.destination = destination;
	}

	@Override
	public Location getDestination()
	{
		return destination;
	}

	@Override
	public String getPortalName()
	{
		return portalName;
	}
}
