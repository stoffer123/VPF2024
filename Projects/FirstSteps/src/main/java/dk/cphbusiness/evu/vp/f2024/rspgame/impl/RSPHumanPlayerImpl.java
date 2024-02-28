package dk.cphbusiness.evu.vp.f2024.rspgame.impl;

import dk.cphbusiness.evu.vp.f2024.rspgame.RSPAction;
import dk.cphbusiness.evu.vp.f2024.rspgame.RSPPlayer;
import dk.cphbusiness.evu.vp.f2024.rspgame.RoundResult;
import dk.cphbusiness.evu.vp.f2024.textio.TextIO;

public class RSPHumanPlayerImpl implements RSPPlayer
{
	private final TextIO io;

	public RSPHumanPlayerImpl(TextIO io)
	{
		this.io = io;
	}

	@Override
	public void startGame(int rounds)
	{
		io.put("New game of Rock, Scissors, Paper is starting. There are " + rounds + " rounds.");
		io.put(System.lineSeparator());
	}

	@Override
	public RSPAction chooseAction()
	{
		String[] actions = {"Rock", "Scissors", "Paper"};
		int action = io.choose("Please choose your action:", actions, "Enter your choice: ");
		if(action == 0) return RSPAction.ROCK;
		if(action == 1) return RSPAction.SCISSORS;
		return RSPAction.PAPER;
	}

	@Override
	public void roundResult(RSPAction yourAction, RSPAction opponentAction, RoundResult result)
	{
		io.put("You: " + yourAction + " opponent: " + opponentAction);
		io.put(" Your result: " + result);
		io.put(System.lineSeparator());
	}

	@Override
	public void gameEnd(int ownPoints, int opponentPoints)
	{
		io.put("Game has ended. Points: you -> " + ownPoints + " opponent -> " + opponentPoints);
		io.put(System.lineSeparator());
	}
}
