package dk.cphbusiness.evu.vp.f2024.rockpaperscissor.impl;

import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.GameCtrl;
import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.Player;

import java.util.List;

public class GameCtrlImpl implements GameCtrl
{

    @Override
    public void runGame(Player player1, Player player2, List<String> options)
    {
        while(true)
        {
            String player1Choice = player1.chooseHand(options);
            String player2Choice = player2.chooseHand(options);
            checkWinner(player1Choice, player2Choice);
        }
    }

    private void checkWinner(String player1Choice, String player2Choice)
    {
        if(player1Choice.equals(player2Choice))
        {
            System.out.println("draw");
        }else if(player1Choice.equals("Scissor") && player2Choice.equals("Paper"))
        {
            System.out.println("Player 1 wins");
        }else if(player1Choice.equals("Rock") && player2Choice.equals("Scissor"))
        {
            System.out.println("Player 1 wins");
        }else if(player1Choice.equals("Paper") && player2Choice.equals("Rock"))
        {
            System.out.println("Player 1 wins");
        }
        //Check player 2
        else if(player2Choice.equals("Scissor") && player1Choice.equals("Paper"))
        {
            System.out.println("Player 2 wins");
        }else if(player2Choice.equals("Rock") && player1Choice.equals("Scissor"))
        {
            System.out.println("Player 2 wins");
        }else if(player2Choice.equals("Paper") && player1Choice.equals("Rock"))
        {
            System.out.println("Player 2 wins");
        }

    }
}
