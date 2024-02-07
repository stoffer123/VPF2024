package dk.cphbusiness.evu.vp.f2024;

import dk.cphbusiness.evu.vp.f2024.lamps.*;

public class LampDemo
{
	public static void main(String[] args)
	{
		Lamp lamp1 = new LampImpl();
		lamp1.turnOn();
		Lamp lamp2 = new LampImpl();
		lamp2.turnOn();
		DimmableLamp lamp3 = new DimmableLampImpl();
		lamp3.setLightLevel(42);
		ColorLamp lamp4 = new ColorLampImpl();

		SmartLamp lamp5 = new SmartLampImpl();
		lamp5.turnOn();
		System.out.println(lamp1);
		System.out.println(lamp2);
		System.out.println(lamp3);
		System.out.println(lamp4);
		System.out.println(lamp5);
	}
}
