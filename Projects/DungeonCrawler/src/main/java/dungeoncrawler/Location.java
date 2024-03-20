package dungeoncrawler;

import java.util.List;

public interface Location
{
	String getName();
	String getDescription();
	List<Portal> getPortals();
	List<Entity> getEntities();
	void addEntity(Entity entity);
	void removeEntity(Entity entity);
	void addPortal(Portal portal);
}
