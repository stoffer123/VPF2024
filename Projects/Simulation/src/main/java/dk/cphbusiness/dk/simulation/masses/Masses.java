package dk.cphbusiness.dk.simulation.masses;

import dk.cphbusiness.dk.simulation.draw.Render;

import java.util.ArrayList;
import java.util.List;

public class Masses
{
	private List<Mass> masses;

	public Masses()
	{
		masses = new ArrayList<Mass>();
	}

	public void addMass(Mass mass)
	{
		masses.add(mass);
	}

	public void update(double dt)
	{
		for (Mass mass : masses)
		{
			mass.update(dt);
		}
	}

	public List<Mass> getMasses()
	{
		return masses;
	}

	public void render(Render render)
	{
		for (Mass mass : masses)
		{
			render.renderMass(mass);
		}
	}
}
