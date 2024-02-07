package dk.cphbusiness.evu.vp.f2024.lamps;

public interface DimmableLamp extends Lamp
{
	void increaseLight();
	void decreaseLight();
	void setLightLevel(int percent);
	int getLightLevel();
}
