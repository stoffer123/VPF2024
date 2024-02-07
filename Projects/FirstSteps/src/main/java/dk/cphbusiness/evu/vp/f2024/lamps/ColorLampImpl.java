package dk.cphbusiness.evu.vp.f2024.lamps;

import java.awt.Color;

public class ColorLampImpl implements ColorLamp
{
	private Lamp lamp;
	private Color color;

	public ColorLampImpl()
	{
		this.lamp = new LampImpl();
		color = new Color(1.0f, 1.0f, 1.0f);
	}

	public ColorLampImpl(Lamp lamp)
	{
		this.lamp = lamp;
		color = new Color(1.0f, 1.0f, 1.0f);
	}

	@Override
	public String getName()
	{
		return lamp.getName();
	}

	@Override
	public void setName(String name)
	{
		lamp.setName(name);
	}

	@Override
	public void turnOn()
	{
		lamp.turnOn();
	}

	@Override
	public void turnOff()
	{
		lamp.turnOff();
	}

	@Override
	public boolean isOn()
	{
		return lamp.isOn();
	}

	@Override
	public void setColor(Color color)
	{
		this.color = color;
	}

	@Override
	public Color getColor()
	{
		return color;
	}

	@Override
	public String toString()
	{
		return "SimpleColorLamp{name='" + this.getName() + "', isOn=" + this.isOn() +
			", color=" + color +
			'}';
	}
}
