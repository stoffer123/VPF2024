package dk.cphbusiness.evu.vp.f2024.lamps;

public class DimmableLampImpl implements DimmableLamp
{
	private Lamp lamp;
	private int lightLevel;

	public DimmableLampImpl()
	{
		this.lamp = new LampImpl();
		this.lightLevel = 100;
	}

	public DimmableLampImpl(Lamp lamp)
	{
		this.lamp = lamp;
		this.lightLevel = 100;
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
	public void increaseLight()
	{
		if(lightLevel < 100)
		{
			++lightLevel;
		}
	}

	@Override
	public void decreaseLight()
	{
		if(lightLevel > 0)
		{
			--lightLevel;
		}
	}

	@Override
	public void setLightLevel(int percent)
	{
		if(percent < 0 || percent > 100)
		{
			throw new IllegalArgumentException("The parameter percent must be in the range [0;100]");
		}
		this.lightLevel = percent;
	}

	@Override
	public int getLightLevel()
	{
		return lightLevel;
	}

	@Override
	public String toString()
	{
		return "SimpleDimmableLamp{name='" + this.getName() + "', isOn=" + this.isOn() +
			", lightLevel=" + lightLevel +
			'}';
	}
}
