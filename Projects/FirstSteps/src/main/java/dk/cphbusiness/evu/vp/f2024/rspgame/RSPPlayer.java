package dk.cphbusiness.evu.vp.f2024.rspgame;

public interface RSPPlayer
{
	void startGame(int rounds);
	RSPAction chooseAction();
	void roundResult(RSPAction yourAction, RSPAction opponentAction, RoundResult result);
	void gameEnd(int ownPoints, int opponentPoints);
}
