package dk.cphbusiness.evu.vp.f2024.tictactoe.impl;

import dk.cphbusiness.evu.vp.f2024.tictactoe.Board;
import dk.cphbusiness.evu.vp.f2024.tictactoe.Player;

public class BoardImpl implements Board
{
    private static char[][] board = new char[3][3];
    @Override
    public void initialize()
    {
        int num = 0;
        for(int y = 0; y < 3; y++)
        {
            for(int x = 0; x < 3; x++)
            {
                board[x][y] = (char)num;
                num++;
            }
        }
    }

    @Override
    public void checkWinner(Player player)
    {

    }

    @Override
    public void printBoard()
    {

    }

    @Override
    public void makeMove(Player player)
    {

    }
}
