package dk.cphbusiness.vp2024.processingfun.processingimpl;

import dk.cphbusiness.vp2024.processingfun.intf.Render;
import processing.core.PApplet;

public class ProcessingRender implements Render
{
	private final PApplet pApp;

	public ProcessingRender(PApplet pApp)
	{
		this.pApp = pApp;
	}

	@Override
	public void size(int xSize, int ySize)
	{
		pApp.size(xSize, ySize);
	}

	@Override
	public void background(int color)
	{
		pApp.background(color);
	}

	@Override
	public void fill(int color)
	{
		pApp.fill(color);
	}

	@Override
	public void circle(int x, int y, int radius)
	{
		pApp.circle(x, y, radius);
	}

	@Override
	public int getXSize()
	{
		return pApp.width;
	}

	@Override
	public int getYSize()
	{
		return pApp.height;
	}
}
