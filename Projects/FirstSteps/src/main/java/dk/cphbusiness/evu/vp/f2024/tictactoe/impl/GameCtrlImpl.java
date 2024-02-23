package dk.cphbusiness.evu.vp.f2024.tictactoe.impl;

import dk.cphbusiness.evu.vp.f2024.tictactoe.Board;
import dk.cphbusiness.evu.vp.f2024.tictactoe.GameCtrl;
import dk.cphbusiness.evu.vp.f2024.tictactoe.Player;

public class GameCtrlImpl implements GameCtrl
{
    @Override
    public void runGame(Board board, Player player1, Player player2)

    {
        board.printBoard();
        board.makeMove(player1);
        board.printBoard();
        board.makeMove(player2);
        board.printBoard();
    }
}
