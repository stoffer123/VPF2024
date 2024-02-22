package dk.cphbusiness.evu.vp.f2024.tictactoe;

public interface Board
{
    void initialize();
    void checkWinner(Player player);
    void printBoard();
    void makeMove(Player player);


}
