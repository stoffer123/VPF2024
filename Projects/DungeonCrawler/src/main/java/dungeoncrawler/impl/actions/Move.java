package dungeoncrawler.impl.actions;

import dungeoncrawler.Action;
import dungeoncrawler.Entity;
import dungeoncrawler.Portal;

public class Move implements Action
{
	private final Entity entity;
	private final Portal portal;

	public Move(Entity entity, Portal portal)
	{
		this.entity = entity;
		this.portal = portal;
	}

	@Override
	public String getName()
	{
		return "Move " + portal.getPortalName();
	}

	@Override
	public void execute()
	{
		entity.move(portal);
	}

	@Override
	public String toString()
	{
		return getName();
	}
}
