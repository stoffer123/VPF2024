package dk.cphbusiness.vp2024.processingfun.apps;

import dk.cphbusiness.vp2024.processingfun.intf.Render;
import processing.core.PApplet;

public class Circle
{
	private int x;
	private int y;
	private int radius;
	private int color;

	public Circle(int x, int y, int radius, int color)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}

	public void draw(Render r)
	{
		r.fill(color);
		r.circle(x, y, radius);
	}
}
