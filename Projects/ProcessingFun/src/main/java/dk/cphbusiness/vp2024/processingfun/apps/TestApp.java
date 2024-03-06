package dk.cphbusiness.vp2024.processingfun.apps;

import dk.cphbusiness.vp2024.processingfun.intf.App;
import dk.cphbusiness.vp2024.processingfun.intf.Render;

public class TestApp implements App
{
	private Circle c1;
	private Circle c2;

	public TestApp()
	{

		c1 = new Circle(50, 50, 20, 0xFFFF0000);
		c2 = new Circle(150, 50, 40, 0xFF0000FF);
	}

	@Override
	public void settings(Render r)
	{
		r.size(1000, 500);
	}

	@Override
	public void setup(Render r)
	{

	}

	@Override
	public void draw(Render r)
	{
		r.background(0x00000000);
		c1.draw(r);
		c2.draw(r);
	}
}
