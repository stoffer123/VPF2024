package dk.cphbusiness.evu.vp.f2024;

public class Lamp
{
	private static int lampNumber;
	private String name;
	private boolean isOn;
	private int lightLevel; // [0,100]

	static
	{
		lampNumber = 1;
	}

	public Lamp()
	{
		this.name = "Lamp " + lampNumber++;
		isOn = false;
		lightLevel = 100;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void turnOn()
	{
		isOn = true;
	}

	public void turnOff()
	{
		isOn = false;
	}

	public void turnUp()
	{
		if(lightLevel < 100)
		{
			++lightLevel;
		}
	}

	public void turnDown()
	{
		if(lightLevel > 0)
		{
			--lightLevel;
		}
	}


	@Override
	public String toString()
	{
		return  name + " " + (isOn ? "ON" : "OFF") + " " + lightLevel;
	}
}
