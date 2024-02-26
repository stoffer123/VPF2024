package dk.cphbusiness.evu.vp.f2024.tictactoe.impl;

import dk.cphbusiness.evu.vp.f2024.tictactoe.Board;
import dk.cphbusiness.evu.vp.f2024.tictactoe.GameCtrl;
import dk.cphbusiness.evu.vp.f2024.tictactoe.Player;

public class GameCtrlImpl implements GameCtrl
{
    @Override
    public void runGame(Board board, Player player1, Player player2)

    {
        while(true)
        {
            board.printBoard();
            board.makeMove(player1);
            if(winnerWasFound(board, player1, player2)){ break;}
            board.printBoard();
            board.makeMove(player2);
            if(winnerWasFound(board, player1, player2)){ break;}


        }
    }
    private boolean winnerWasFound(Board board, Player player1, Player player2)
    {
        if(board.checkWinner(player1) || board.checkWinner(player2) || board.checkDraw(player1, player2))
        {
            return true;
        }
        return false;
    }
}
