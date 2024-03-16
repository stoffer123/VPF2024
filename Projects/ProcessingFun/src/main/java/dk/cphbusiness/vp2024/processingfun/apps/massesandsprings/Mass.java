package dk.cphbusiness.vp2024.processingfun.apps.massesandsprings;

import dk.cphbusiness.vp2024.processingfun.intf.Drawable;
import dk.cphbusiness.vp2024.processingfun.intf.Render;

public class Mass
{
	private float mass;
	private float radius;
	private float xPos;
	private float yPos;
	private float xSpeed;
	private float ySpeed;
	private float xForce;
	private float yForce;


	void addForce(float xForce, float yForce)
	{
		this.xForce += xForce;
		this.yForce += yForce;
	}

	void resetForce()
	{
		this.xForce = 0;
		this.yForce = 0;
	}

	void updateVelocityAndPosition(float deltaT)
	{
		float xAcc = xForce / mass;
		float yAcc = yForce / mass;
		xSpeed += xAcc * deltaT;
		ySpeed += yAcc * deltaT;
		xPos += xSpeed * deltaT;
		yPos += ySpeed * deltaT;
	}

	public void draw(WorldRender wr)
	{
		wr.renderMass(mass, xPos, yPos, xSpeed, ySpeed);
	}
}
