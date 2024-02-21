package dk.cphbusiness.evu.vp.f2024.guessgame.impl;

import dk.cphbusiness.evu.vp.f2024.guessgame.GuessEvaluation;
import dk.cphbusiness.evu.vp.f2024.guessgame.Guesser;
import dk.cphbusiness.evu.vp.f2024.textio.SystemTextIOImpl;
import dk.cphbusiness.evu.vp.f2024.textio.TextIO;

public class HumanGuesser implements Guesser
{
	private final TextIO io;
	private int min;
	private int max;

	public HumanGuesser(TextIO io)
	{
		this.io = io;
	}

	@Override
	public void startGame(int min, int max)
	{
		this.min = min;
		this.max = max;
		io.put("New game started. You are the guesser. The interval is from "
			+ min + " to " + max + " (both inclusive).");
		io.put(System.lineSeparator());
	}

	@Override
	public int makeGuess()
	{
		io.put("Please enter your guess: ");
		int guess = io.getInt(min, max);
		return guess;
	}

	@Override
	public void giveEvaluation(GuessEvaluation evaluation)
	{
		String msg = "Your guess was " +
			switch(evaluation)
			{
				case TOO_LOW -> "too low.";
				case CORRECT -> "correct.";
				case TOO_HIGH -> "too high";
			};
		io.put(msg);
		io.put(System.lineSeparator());
	}

	@Override
	public void endGame(int guesses)
	{
		io.put("Game has ended. " + guesses + " guess(es) was used!");
		io.put(System.lineSeparator());
	}
}
