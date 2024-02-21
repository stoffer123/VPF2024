package dk.cphbusiness.evu.vp.f2024.guessgame.impl;

import dk.cphbusiness.evu.vp.f2024.guessgame.GuessEvaluation;
import dk.cphbusiness.evu.vp.f2024.guessgame.Guesser;

public class ComputerGuesser implements Guesser
{
	private int min;
	private int max;
	private int guess;

	@Override
	public void startGame(int min, int max)
	{
		this.min = min;
		this.max = max;
	}

	@Override
	public int makeGuess()
	{
		guess = (min + max)/2;
		return guess;
	}

	@Override
	public void giveEvaluation(GuessEvaluation evaluation)
	{
		if(evaluation == GuessEvaluation.TOO_LOW)
		{
			min = guess + 1;
		}
		else if(evaluation == GuessEvaluation.TOO_HIGH)
		{
			max = guess - 1;
		}
	}

	@Override
	public void endGame(int guesses)
	{

	}
}
