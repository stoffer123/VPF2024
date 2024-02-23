package dk.cphbusiness.evu.vp.f2024.tictactoe.impl;

import dk.cphbusiness.evu.vp.f2024.tictactoe.Player;

public class PlayerImpl implements Player
{
    private String name;
    private char symbol;

    public PlayerImpl(String name, char symbol)
    {
        this.name = name;
        this.symbol = symbol;
    }
    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public String getName() {
        return name;
    }
}
