package dk.cphbusiness.evu.vp.f2024.rspgame.impl;

import dk.cphbusiness.evu.vp.f2024.rspgame.RSPAction;
import dk.cphbusiness.evu.vp.f2024.rspgame.RSPPlayer;
import dk.cphbusiness.evu.vp.f2024.rspgame.RoundResult;

import java.util.Random;

public class RSPComputerPlayerImpl implements RSPPlayer
{
	private static final Random rnd = new Random();


	@Override
	public void startGame(int rounds)
	{

	}

	@Override
	public RSPAction chooseAction()
	{
		return RSPAction.values()[rnd.nextInt(3)];
	}

	@Override
	public void roundResult(RSPAction yourAction, RSPAction opponentAction, RoundResult result)
	{

	}

	@Override
	public void gameEnd(int ownPoints, int opponentPoints)
	{

	}
}
