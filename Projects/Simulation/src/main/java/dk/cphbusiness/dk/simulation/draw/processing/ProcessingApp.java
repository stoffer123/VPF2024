package dk.cphbusiness.dk.simulation.draw.processing;

import dk.cphbusiness.dk.simulation.draw.Render;
import dk.cphbusiness.dk.simulation.masses.Mass;
import processing.core.PApplet;

public class ProcessingApp extends PApplet implements Render
{
	public static void main(String args[])
	{
		PApplet.main("dk.cphbusiness.vp2024.massesandsprings.App");
	}



	@Override
	public void settings()
	{
		fullScreen();
	}

	@Override
	public void setup()
	{
		textSize(20);
	}

	@Override
	public void draw()
	{
	}


	@Override
	public void renderMass(Mass mass)
	{

		circle((float) mass.getPosition().x, (float) mass.getPosition().y, (float) mass.getRadius() * 2);
	}
}
