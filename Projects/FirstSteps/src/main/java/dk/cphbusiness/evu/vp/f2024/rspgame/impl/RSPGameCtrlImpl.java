package dk.cphbusiness.evu.vp.f2024.rspgame.impl;

import dk.cphbusiness.evu.vp.f2024.rspgame.RSPAction;
import dk.cphbusiness.evu.vp.f2024.rspgame.RSPGameCtrl;
import dk.cphbusiness.evu.vp.f2024.rspgame.RSPPlayer;
import dk.cphbusiness.evu.vp.f2024.rspgame.RoundResult;

public class RSPGameCtrlImpl implements RSPGameCtrl
{
	@Override
	public void runGame(int rounds, RSPPlayer player1, RSPPlayer player2)
	{
		player1.startGame(rounds);
		player2.startGame(rounds);
		int player1Wins = 0;
		int player2Wins = 0;
		for(int round = 1; round <= rounds; ++round)
		{
			int result = runRound(player1, player2);
			if(result == 1)
			{
				++player1Wins;
			}
			else if(result == 2)
			{
				++player2Wins;
			}
		}
		player1.gameEnd(player1Wins, player2Wins);
		player2.gameEnd(player2Wins, player1Wins);
	}

	private int runRound(RSPPlayer player1, RSPPlayer player2)
	{
		RSPAction p1Action = player1.chooseAction();
		RSPAction p2Action = player2.chooseAction();
		if(p1Action == p2Action)
		{
			player1.roundResult(p1Action, p2Action, RoundResult.TIE);
			player2.roundResult(p2Action, p1Action, RoundResult.TIE);
			return 0;
		}
		if( (p1Action == RSPAction.ROCK && p2Action == RSPAction.SCISSORS) ||
			(p1Action == RSPAction.SCISSORS && p2Action == RSPAction.PAPER) ||
			(p1Action == RSPAction.PAPER && p2Action == RSPAction.ROCK))
		{
			player1.roundResult(p1Action, p2Action, RoundResult.WIN);
			player2.roundResult(p2Action, p1Action, RoundResult.LOOSE);
			return 1;
		}
		else
		{
			player1.roundResult(p1Action, p2Action, RoundResult.LOOSE);
			player2.roundResult(p2Action, p1Action, RoundResult.WIN);
			return 2;
		}
	}
}
