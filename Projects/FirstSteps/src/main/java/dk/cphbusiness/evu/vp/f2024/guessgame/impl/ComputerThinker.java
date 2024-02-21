package dk.cphbusiness.evu.vp.f2024.guessgame.impl;

import dk.cphbusiness.evu.vp.f2024.guessgame.GuessEvaluation;
import dk.cphbusiness.evu.vp.f2024.guessgame.Thinker;

import java.util.Random;

public class ComputerThinker implements Thinker
{
	private static Random rnd = new Random();
	private int secret;
	@Override
	public void startGame(int min, int max)
	{
		secret = (rnd.nextInt(max-min+1) + min);
	}

	@Override
	public GuessEvaluation evaluateGuess(int guess)
	{
		if(guess < secret)
		{
			return GuessEvaluation.TOO_LOW;
		}
		else if(guess > secret)
		{
			return GuessEvaluation.TOO_HIGH;
		}
		return GuessEvaluation.CORRECT;
	}

	@Override
	public void endGame(int guesses) {}
}
