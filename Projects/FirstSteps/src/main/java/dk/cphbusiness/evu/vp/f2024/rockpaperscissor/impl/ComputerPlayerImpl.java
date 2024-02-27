package dk.cphbusiness.evu.vp.f2024.rockpaperscissor.impl;

import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.Player;

import java.util.List;
import java.util.Random;

public class ComputerPlayerImpl implements Player
{
    private int score;
    private String name;
    private Random rand = new Random();


    public ComputerPlayerImpl(String name)
    {
        this.score = 0;
        this.name = name;
    }
    @Override
    public String chooseHand(List<String> options)
    {
        String choice = options.get(rand.nextInt(3));
        return choice;

    }

    @Override
    public void setName(String newName)
    {
        this.name = newName;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
