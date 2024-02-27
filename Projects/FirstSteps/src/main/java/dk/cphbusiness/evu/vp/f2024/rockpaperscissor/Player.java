package dk.cphbusiness.evu.vp.f2024.rockpaperscissor;

import java.util.List;

public interface Player
{
    void chooseHand(List<String> options);
    void setName();
    String getName();

}
