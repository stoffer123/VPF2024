package dk.cphbusiness.evu.vp.f2024.rockpaperscissor.impl;

import dk.cphbusiness.evu.vp.f2024.rockpaperscissor.Player;
import dk.cphbusiness.evu.vp.f2024.textio.SystemTextIOImpl;
import dk.cphbusiness.evu.vp.f2024.textio.TextIO;

import java.util.List;

public class HumanPlayerImpl implements Player
{
    private int score;
    private String name;
    private TextIO io;

    public HumanPlayerImpl(String name, TextIO io)
    {
        this.name = name;
        this.score = 0;
        this.io = io;
    }


    @Override
    public String chooseHand(List<String> options)
    {
        int choice = io.choose(this.name + " Rock paper or scissor?", options, "Select a hand: ");

        return options.get(choice);
    }

    @Override
    public void setName(String newName)
    {
        this.name = newName;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
