package dk.cphbusiness.evu.vp.f2024.guessgame;

public interface Thinker
{
	void startGame(int min, int max);
	GuessEvaluation evaluateGuess(int guess);
	void endGame(int guesses);
}

