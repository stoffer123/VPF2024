package dk.cphbusiness.evu.vp.f2024.rockpaperscissor.demo;

import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.GameCtrl;
import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.Player;
import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.impl.ComputerPlayerImpl;
import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.impl.GameCtrlImpl;
import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.impl.HumanPlayerImpl;
import dk.cphbusiness.evu.vp.f2024.textio.SystemTextIOImpl;
import dk.cphbusiness.evu.vp.f2024.textio.TextIO;

import java.util.List;

public class RpsDemo
{

    public static void main(String[] args)

    {
        String[] playerTypes = {"Human", "Computer"};
        TextIO io = new SystemTextIOImpl();
        Player player1;
        Player player2;

        //Create player 1
        switch(io.choose("Who should play player1: ", playerTypes, "choose: "))
        {
            case 0 ->
            {
                System.out.println("What is the name of player1: ");
                player1 = new HumanPlayerImpl(io.get(), io);
            }

            case 1 ->
            {
                System.out.println("What is the name of player1: ");
                player1 = new ComputerPlayerImpl(io.get());
            }
            default ->
            {
                throw new IllegalStateException("io.choose returned unexpected value");
            }
        }

        //create player 2
        switch(io.choose("Who should play player2: ", playerTypes, "choose: "))
        {
            case 0 ->
            {
                System.out.println("What is the name of player2: ");
                player2 = new HumanPlayerImpl(io.get(), io);
            }

            case 1 ->
            {
                System.out.println("What is the name of player2: ");
                player2 = new ComputerPlayerImpl(io.get());
            }

            default ->
            {
                throw new IllegalStateException("io.choose returned unexpected value");
            }
        }





        List<String> options = List.of("Rock", "Paper", "Scissor");

        GameCtrl gameControl = new GameCtrlImpl();

        gameControl.runGame(player1, player2, options);

    }
}
