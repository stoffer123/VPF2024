package dungeoncrawler;

import java.util.List;

public interface Dungeon
{
	List<Entity> getEntities();
	void addEntity(Entity entity);
}