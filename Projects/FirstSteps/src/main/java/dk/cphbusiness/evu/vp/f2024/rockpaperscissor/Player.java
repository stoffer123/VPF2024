package dk.cphbusiness.evu.vp.f2024.rockpaperscissor;

import java.util.List;

public interface Player
{
    String chooseHand(List<String> options);
    void setName(String newName);
    String getName();

}
