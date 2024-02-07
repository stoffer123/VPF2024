package dk.cphbusiness.evu.vp.f2024.lamps;

public interface Lamp
{
	String getName();
	void setName(String name);
	void turnOn();
	void turnOff();
	boolean isOn();
}
