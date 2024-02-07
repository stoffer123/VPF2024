package dk.cphbusiness.evu.vp.f2024.lamps;

import java.awt.*;

public class SmartLampImpl implements SmartLamp
{
	private DimmableLamp dimmableLamp;
	private ColorLamp colorLamp;

	public SmartLampImpl()
	{
		Lamp lamp = new LampImpl();
		dimmableLamp = new DimmableLampImpl(lamp);
		colorLamp = new ColorLampImpl(lamp);
	}

	@Override
	public void increaseLight()
	{
		dimmableLamp.increaseLight();
	}

	@Override
	public void decreaseLight()
	{
		dimmableLamp.decreaseLight();
	}

	@Override
	public void setLightLevel(int percent)
	{
		dimmableLamp.setLightLevel(percent);
	}

	@Override
	public int getLightLevel()
	{
		return dimmableLamp.getLightLevel();
	}

	@Override
	public String getName()
	{
		return dimmableLamp.getName();
	}

	@Override
	public void setName(String name)
	{
		dimmableLamp.setName(name);
	}

	@Override
	public void turnOn()
	{
		dimmableLamp.turnOn();
	}

	@Override
	public void turnOff()
	{
		dimmableLamp.turnOff();
	}

	@Override
	public boolean isOn()
	{
		return dimmableLamp.isOn();
	}

	@Override
	public void setColor(Color color)
	{
		colorLamp.setColor(color);
	}

	@Override
	public Color getColor()
	{
		return colorLamp.getColor();
	}

	@Override
	public String toString()
	{
		return "SmartLampImpl{name='" + getName() + ", isOn=" + isOn() +
			", lightLevel=" + getLightLevel() + ", color=" + getColor() + '}';
	}
}
