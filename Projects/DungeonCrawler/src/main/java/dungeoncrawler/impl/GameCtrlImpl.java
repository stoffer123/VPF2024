package dungeoncrawler.impl;

import dungeoncrawler.Action;
import dungeoncrawler.Dungeon;
import dungeoncrawler.Entity;
import dungeoncrawler.GameCtrl;

public class GameCtrlImpl implements GameCtrl
{
	@Override
	public void runGame(Dungeon dungeon)
	{
		int round = 1;

		while (true)
		{
			System.out.println("Round " + round);
			for (Entity entity : dungeon.getEntities())
			{
				System.out.println(entity.getName() + "'s turn");
				Action action = entity.getController().chooseAction(entity.getPossibleActions(), entity);
				action.execute();
			}
			round++;
		}
	}
}
