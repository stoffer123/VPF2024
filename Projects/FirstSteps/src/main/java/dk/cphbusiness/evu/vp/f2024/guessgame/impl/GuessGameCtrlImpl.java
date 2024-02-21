package dk.cphbusiness.evu.vp.f2024.guessgame.impl;

import dk.cphbusiness.evu.vp.f2024.guessgame.GuessEvaluation;
import dk.cphbusiness.evu.vp.f2024.guessgame.GuessGameCtrl;
import dk.cphbusiness.evu.vp.f2024.guessgame.Guesser;
import dk.cphbusiness.evu.vp.f2024.guessgame.Thinker;

public class GuessGameCtrlImpl implements GuessGameCtrl
{
	@Override
	public void runGame(int min, int max, Thinker thinker, Guesser guesser)
	{
		thinker.startGame(min, max);
		guesser.startGame(min, max);
		int guesses = 0;
		while(true)
		{
			int guess = guesser.makeGuess();
			++guesses;
			GuessEvaluation evaluation = thinker.evaluateGuess(guess);
			guesser.giveEvaluation(evaluation);
			if(evaluation == GuessEvaluation.CORRECT)
			{
				break;
			}
		}
		thinker.endGame(guesses);
		guesser.endGame(guesses);
		System.out.println("Game over. " + guesses + " guesses used!");
	}
}
