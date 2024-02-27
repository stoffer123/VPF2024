package dk.cphbusiness.evu.vp.f2024.rockpaperscissor.demo;

import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.GameCtrl;
import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.Player;
import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.impl.ComputerPlayerImpl;
import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.impl.GameCtrlImp;

import java.util.List;

public class RpsDemo
{
    public static void main(String[] args)
    {
        List<String> options = List.of("Rock", "Paper", "Scissor");
        Player player1 = new ComputerPlayerImpl("Spiller1");
        Player player2 = new ComputerPlayerImpl("Spiller2");

        GameCtrl gameControl = new GameCtrlImp();

        gameControl.runGame(player1, player2, options);

    }
}
