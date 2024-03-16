package dk.cphbusiness.vp2024.processingfun.apps.massesandsprings;

import dk.cphbusiness.vp2024.processingfun.intf.Render;

public class WorldRender
{
	private final Render render;
	private float factor;

	public WorldRender(Render render, float worldWith)
	{
		this.render = render;
		float factor = ((float) render.getXSize()) / worldWith;

	}

	void renderMass(float mass, float xPos, float yPos, float xSpeed, float ySpeed)
	{
		float area = mass * 0.007854f;
		float radius = (float) Math.sqrt(area / Math.PI);
	}
}
