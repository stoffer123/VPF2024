package dk.cphbusiness.evu.vp.f2024.guessgame.demo;

import dk.cphbusiness.evu.vp.f2024.guessgame.GuessGameCtrl;
import dk.cphbusiness.evu.vp.f2024.guessgame.Guesser;
import dk.cphbusiness.evu.vp.f2024.guessgame.Thinker;
import dk.cphbusiness.evu.vp.f2024.guessgame.impl.*;
import dk.cphbusiness.evu.vp.f2024.textio.SystemTextIOImpl;
import dk.cphbusiness.evu.vp.f2024.textio.TextIO;

public class RunGame
{
	public static void main(String[] args)
	{
		String[] options = {"Human", "Computer"};
		TextIO io = new SystemTextIOImpl();
		Thinker thinker;
		int thinkerChoice = io.choose("Who should play thinker: ", options, "Make your choice:");
		if(thinkerChoice == 0)
		{
			thinker = new HumanThinker(io);
		}
		else
		{
			thinker = new ComputerThinker();
		}
		Guesser guesser;
		int guesserChoice = io.choose("Who should play guesser: ", options, "Make your choice:");
		if(guesserChoice == 0)
		{
			guesser = new HumanGuesser(io);
		}
		else
		{
			guesser = new ComputerGuesser();
		}
		io.put("What is minimum: ");
		int min = io.getInt();
		io.put("What is maximum: ");
		int max = io.getInt();
		GuessGameCtrl ctrl = new GuessGameCtrlImpl();

		ctrl.runGame(min, max, thinker, guesser);
	}
}
