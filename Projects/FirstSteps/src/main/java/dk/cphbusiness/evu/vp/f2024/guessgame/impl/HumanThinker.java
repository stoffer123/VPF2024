package dk.cphbusiness.evu.vp.f2024.guessgame.impl;

import dk.cphbusiness.evu.vp.f2024.guessgame.GuessEvaluation;
import dk.cphbusiness.evu.vp.f2024.guessgame.Thinker;
import dk.cphbusiness.evu.vp.f2024.textio.SystemTextIOImpl;
import dk.cphbusiness.evu.vp.f2024.textio.TextIO;

public class HumanThinker implements Thinker
{
	private final TextIO io;

	public HumanThinker(TextIO io)
	{
		this.io = io;
	}

	@Override
	public void startGame(int min, int max)
	{
		io.put("New game started. You are the thinker. Think of a number from "
			+ min + " to " + max + " (both inclusive).");
		io.put(System.lineSeparator());
		io.put("Press enter when ready...");
		io.get();
	}

	@Override
	public GuessEvaluation evaluateGuess(int guess)
	{
		String[] options = {"Too low", "Correct", "Too high"};
		int choice = io.choose("The guess is " + guess + " was that: ", options, "Evaluate guess: ");
		return GuessEvaluation.values()[choice];
	}

	@Override
	public void endGame(int guesses)
	{
		io.put("Game has ended with " + guesses + " guess(es).");
		io.put(System.lineSeparator());
	}
}
