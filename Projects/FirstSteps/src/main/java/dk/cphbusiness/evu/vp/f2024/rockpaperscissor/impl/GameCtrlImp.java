package dk.cphbusiness.evu.vp.f2024.rockpaperscissor.impl;

import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.GameCtrl;
import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.Player;

import java.util.List;

public class GameCtrlImp implements GameCtrl
{
    private static List<String> options = List.of("Rock", "Paper", "Scissor");
    @Override
    public void runGame(Player player1, Player player2, List<String> options)
    {

    }
}