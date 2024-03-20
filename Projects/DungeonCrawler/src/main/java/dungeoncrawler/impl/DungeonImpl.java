package dungeoncrawler.impl;

import dungeoncrawler.Dungeon;
import dungeoncrawler.Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DungeonImpl implements Dungeon
{
	private List<Entity> entities;

	public DungeonImpl()
	{
		entities = new ArrayList<>();
	}

	@Override
	public List<Entity> getEntities()
	{
		return Collections.unmodifiableList(entities);
	}

	public void addEntity(Entity entity)
	{
		entities.add(entity);
	}
}
