package dk.cphbusiness.evu.vp.f2024.rockpaperscissor.demo;

import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.GameCtrl;
import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.Player;
import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.impl.ComputerPlayerImpl;
import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.impl.GameCtrlImpl;
import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.impl.HumanPlayerImpl;

import java.util.List;

public class RpsDemo
{
    public static void main(String[] args)
    {
        List<String> options = List.of("Rock", "Paper", "Scissor");
        Player player1 = new HumanPlayerImpl("Spiller1");
        Player player2 = new HumanPlayerImpl("Spiller2");

        GameCtrl gameControl = new GameCtrlImpl();

        gameControl.runGame(player1, player2, options);

    }
}
