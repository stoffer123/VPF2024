package dk.cphbusiness.simulation.draw.processing;

import dk.cphbusiness.simulation.Simulation;
import dk.cphbusiness.simulation.draw.Render;
import dk.cphbusiness.simulation.masses.Mass;
import processing.core.PApplet;

public class ProcessingApp extends PApplet implements Render
{
	private float worldHeight = 10;
	private float worldToScreen;
	private Simulation simulation;

	public static void main(String args[])
	{
		PApplet.main("dk.cphbusiness.simulation.draw.processing.ProcessingApp");
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
		simulation = new Simulation();
		worldToScreen = height / worldHeight;
	}

	@Override
	public void draw()
	{
		background(0xFFAAAAAA);
		double time = millis() / 1000.0;
		simulation.update(time);
		simulation.render(this);
	}

	@Override
	public void renderMass(Mass mass)
	{
		float x = (float) mass.getPosition().x;
		float y = (float) mass.getPosition().y;
		float r = (float) mass.getRadius();
		stroke(0xFF000000);
		fill(0xFF00A000);
		circle(x*worldToScreen, (worldHeight-y)*worldToScreen, r * 2 * worldToScreen);
	}
}
