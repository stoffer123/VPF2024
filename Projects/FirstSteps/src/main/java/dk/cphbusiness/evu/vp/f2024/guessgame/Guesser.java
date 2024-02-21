package dk.cphbusiness.evu.vp.f2024.guessgame;

public interface Guesser
{
	void startGame(int min, int max);
	int makeGuess();
	void giveEvaluation(GuessEvaluation evaluation);
	void endGame(int guesses);
}
