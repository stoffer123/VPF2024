package dungeoncrawler.impl;

import dungeoncrawler.Action;
import dungeoncrawler.Entity;
import dungeoncrawler.EntityCtrl;

import java.util.List;
import java.util.Random;

public class RandomEntityCtrl implements EntityCtrl
{
	private final static Random rnd = new Random();

	@Override
	public Action chooseAction(List<Action> possibleActions, Entity entity)
	{
		return possibleActions.get(rnd.nextInt(possibleActions.size()));
	}
}
