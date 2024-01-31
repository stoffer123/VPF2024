package dk.cphbusiness.evu.vp.f2024;

public class LampDemo
{
	public static void main(String[] args)
	{
		Lamp lamp1 = new Lamp();
		lamp1.turnOn();
		lamp1.turnDown();
		Lamp lamp2 = new Lamp();
		lamp2.turnOn();
		lamp2.turnDown();
		lamp2.turnDown();
		System.out.println(lamp1);
		System.out.println(lamp2);
	}
}
