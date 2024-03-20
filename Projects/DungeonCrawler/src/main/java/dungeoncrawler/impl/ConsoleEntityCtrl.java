package dungeoncrawler.impl;

import dungeoncrawler.Action;
import dungeoncrawler.Entity;
import dungeoncrawler.EntityCtrl;
import textio.TextIO;

import java.util.ArrayList;
import java.util.List;

public class ConsoleEntityCtrl implements EntityCtrl
{
	private final TextIO textIO;

	public ConsoleEntityCtrl(TextIO textIO)
	{
		this.textIO = textIO;
	}


	@Override
	public Action chooseAction(List<Action> possibleActions, Entity entity)
	{
		List<String> options = new ArrayList<>();
		for (Action action : possibleActions)
		{
			options.add(action.getName());
		}
		int choice = textIO.choose("Choose an action", options, "What will " + entity.getName() + " do? ");
		return possibleActions.get(choice);
	}
}
