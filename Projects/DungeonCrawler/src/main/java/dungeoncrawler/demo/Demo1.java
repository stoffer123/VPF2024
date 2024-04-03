package dungeoncrawler.demo;

import dungeoncrawler.*;
import dungeoncrawler.impl.*;
import dungeoncrawler.impl.RandomEntityCtrl;
import textio.SystemTextIOImpl;
import textio.TextIO;

public class Demo1
{
	public static void main(String[] args)
	{
		//Setup
		Location l1 = new LocationImpl("L1", "You are in the L1 room.");
		Location l2 = new LocationImpl("L2", "You are in the L2 room.");
		Location l3 = new LocationImpl("L3", "You are in the L3 room.");
		Portal p1 = new PortalImpl("P1", l2);
		Portal p2 = new PortalImpl("P2", l3);
		Portal p3 = new PortalImpl("P3", l2);
		Portal p4 = new PortalImpl("P4", l1);
		l1.addPortal(p1);
		l1.addPortal(p2);
		l3.addPortal(p3);
		l2.addPortal(p4);

		TextIO textIO = new SystemTextIOImpl();
		EntityCtrl ctrl1 = new ConsoleEntityCtrl(textIO);

		Entity e1 = new EntityImpl("E1", ctrl1);
		l1.addEntity(e1);
		e1.setLocation(l1);

		EntityCtrl ctrl2 = new RandomEntityCtrl();
		Entity e2 = new EntityImpl("E2", ctrl2);
		l3.addEntity(e2);
		e2.setLocation(l3);

		Dungeon dungeon = new DungeonImpl();
		dungeon.addEntity(e1);
		dungeon.addEntity(e2);

		//Game loop
		GameCtrl gameCtrl = new GameCtrlImpl();
		gameCtrl.runGame(dungeon);
	}
}
