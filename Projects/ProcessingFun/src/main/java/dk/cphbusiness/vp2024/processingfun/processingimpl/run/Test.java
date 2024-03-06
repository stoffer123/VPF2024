package dk.cphbusiness.vp2024.processingfun.processingimpl.run;

import dk.cphbusiness.vp2024.processingfun.apps.TestApp;
import dk.cphbusiness.vp2024.processingfun.intf.App;
import dk.cphbusiness.vp2024.processingfun.intf.Render;
import dk.cphbusiness.vp2024.processingfun.processingimpl.ProcessingRender;
import processing.core.PApplet;

public class Test extends PApplet
{
	private Render render;
	private App app;

	public static void main(String args[])
	{
		PApplet.main("dk.cphbusiness.vp2024.processingfun.run.Test");
	}

	public Test()
	{
		super();
		render = new ProcessingRender(this);
		app = new TestApp();
	}

	@Override
	public void settings()
	{
		app.settings(render);
	}

	@Override
	public void setup()
	{
		app.setup(render);
	}

	@Override
	public void draw()
	{
		app.draw(render);
	}
}
