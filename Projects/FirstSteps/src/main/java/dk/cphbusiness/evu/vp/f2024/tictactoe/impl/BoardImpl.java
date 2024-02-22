package dk.cphbusiness.evu.vp.f2024.tictactoe.impl;

import dk.cphbusiness.evu.vp.f2024.tictactoe.Board;
import dk.cphbusiness.evu.vp.f2024.tictactoe.Player;

public class BoardImpl implements Board
{
    private static char[][] board = new char[3][3];

    public BoardImpl()
    {
        initialize();
    }
    @Override
    public void initialize()
    {
        int num = 1;
        for(int y = 0; y < 3; y++)
        {
            for(int x = 0; x < 3; x++)
            {
                board[y][x] = Character.forDigit(num++, 10);


            }
        }
    }

    @Override
    public void checkWinner(Player player)
    {
        if(
                //Check horizontal
                board[0][0] == player.getSymbol() && board[0][1] == player.getSymbol() && board[0][2] == player.getSymbol()
                || board[1][0] == player.getSymbol() && board[1][1] == player.getSymbol() && board[1][2] == player.getSymbol()
                || board[2][0] == player.getSymbol() && board[2][1] == player.getSymbol() && board[2][2] == player.getSymbol()
                //Check vertical
                || board[0][0] == player.getSymbol() && board[1][0] == player.getSymbol() && board[2][0] == player.getSymbol()
                || board[0][1] == player.getSymbol() && board[1][1] == player.getSymbol() && board[2][1] == player.getSymbol()
                || board[0][2] == player.getSymbol() && board[1][2] == player.getSymbol() && board[2][2] == player.getSymbol()
                //Check diagonal
                || board[0][0] == player.getSymbol() && board[1][1] == player.getSymbol() && board[2][2] == player.getSymbol()
                || board[0][2] == player.getSymbol() && board[1][1] == player.getSymbol() && board[2][0] == player.getSymbol()

        )
        {
            //Winner was found
            System.out.println(player.getName() + "Has won!");
        }
    }

    @Override
    public void printBoard()
    {
        System.out.println("+---+---+---+");
        System.out.println("| "+ board[0][0] +" | "+ board[0][1] +" | "+ board[0][2] +" |");
        System.out.println("+---+---+---+");
        System.out.println("| "+ board[1][0] +" | "+ board[1][1] +" | "+ board[1][2] +" |");
        System.out.println("+---+---+---+");
        System.out.println("| "+ board[2][0] +" | "+ board[2][1] +" | "+ board[2][2] +" |");
        System.out.println("+---+---+---+");
    }

    @Override
    public void makeMove(Player player)
    {

    }
}
