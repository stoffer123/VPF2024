package dungeoncrawler.impl;

import dungeoncrawler.Entity;
import dungeoncrawler.Location;
import dungeoncrawler.Portal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LocationImpl implements Location
{
	private final String name;
	private final String description;
	private final List<Portal> portals;
	private final List<Entity> entities;

	public LocationImpl(String name, String description)
	{
		this.name = name;
		this.description = description;
		this.portals = new ArrayList<>();
		this.entities = new ArrayList<>();
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public String getDescription()
	{
		return description;
	}

	@Override
	public List<Portal> getPortals()
	{
		return Collections.unmodifiableList(portals);
	}

	@Override
	public List<Entity> getEntities()
	{
		return Collections.unmodifiableList(entities);
	}

	@Override
	public void addEntity(Entity entity)
	{
		entities.add(entity);
	}

	@Override
	public void removeEntity(Entity entity)
	{
		entities.remove(entity);
	}

	@Override
	public void addPortal(Portal portal)
	{
		portals.add(portal);
	}
}
