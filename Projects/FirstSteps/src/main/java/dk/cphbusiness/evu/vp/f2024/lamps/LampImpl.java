package dk.cphbusiness.evu.vp.f2024.lamps;

public class LampImpl implements Lamp
{
	private static int nextLampNumber = 1;
	private String name;
	private boolean isOn;

	public LampImpl()
	{
		name = "Lamp " + nextLampNumber++;
		isOn = false;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public void turnOn()
	{
		isOn = true;
	}

	@Override
	public void turnOff()
	{
		isOn = false;
	}

	@Override
	public boolean isOn()
	{
		return isOn;
	}

	@Override
	public String toString()
	{
		return "SimpleLamp{" +
			"name='" + name + '\'' +
			", isOn=" + isOn +
			'}';
	}
}
