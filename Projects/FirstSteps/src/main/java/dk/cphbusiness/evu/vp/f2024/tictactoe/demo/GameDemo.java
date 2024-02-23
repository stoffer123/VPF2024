package dk.cphbusiness.evu.vp.f2024.tictactoe.demo;

import dk.cphbusiness.evu.vp.f2024.tictactoe.Board;
import dk.cphbusiness.evu.vp.f2024.tictactoe.GameCtrl;
import dk.cphbusiness.evu.vp.f2024.tictactoe.Player;
import dk.cphbusiness.evu.vp.f2024.tictactoe.impl.BoardImpl;
import dk.cphbusiness.evu.vp.f2024.tictactoe.impl.GameCtrlImpl;
import dk.cphbusiness.evu.vp.f2024.tictactoe.impl.PlayerImpl;

public class GameDemo
{
    public static void main(String[] args) {
        Board board = new BoardImpl();
        Player player1 = new PlayerImpl("Spiller1", 'X');
        Player player2 = new PlayerImpl("Spiller2", 'O');
        GameCtrl gameCtrl = new GameCtrlImpl();

        gameCtrl.runGame(board, player1, player2);


    }
}
