package dk.cphbusiness.evu.vp.f2024.rspgame.demo;

import dk.cphbusiness.evu.vp.f2024.rspgame.RSPGameCtrl;
import dk.cphbusiness.evu.vp.f2024.rspgame.RSPPlayer;
import dk.cphbusiness.evu.vp.f2024.rspgame.impl.RSPComputerPlayerImpl;
import dk.cphbusiness.evu.vp.f2024.rspgame.impl.RSPGameCtrlImpl;
import dk.cphbusiness.evu.vp.f2024.rspgame.impl.RSPHumanPlayerImpl;
import dk.cphbusiness.evu.vp.f2024.textio.SystemTextIOImpl;
import dk.cphbusiness.evu.vp.f2024.textio.TextIO;

public class RunGame
{
	public static void main(String[] args)
	{
		RSPGameCtrl ctrl = new RSPGameCtrlImpl();
		TextIO io = new SystemTextIOImpl();
		RSPPlayer p1 = new RSPHumanPlayerImpl(io);
		RSPPlayer p2 = new RSPComputerPlayerImpl();

		ctrl.runGame(3, p1, p2);
	}
}
