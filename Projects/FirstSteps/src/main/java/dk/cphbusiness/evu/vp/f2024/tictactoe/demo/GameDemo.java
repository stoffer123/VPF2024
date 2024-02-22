package dk.cphbusiness.evu.vp.f2024.tictactoe.demo;

import dk.cphbusiness.evu.vp.f2024.tictactoe.Board;
import dk.cphbusiness.evu.vp.f2024.tictactoe.impl.BoardImpl;

public class GameDemo
{
    public static void main(String[] args) {
        Board board = new BoardImpl();
        board.printBoard();
    }
}
