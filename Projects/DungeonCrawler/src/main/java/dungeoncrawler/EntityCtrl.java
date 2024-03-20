package dungeoncrawler;

import java.util.List;

public interface EntityCtrl
{
	Action chooseAction(List<Action> possibleActions, Entity entity);
}
