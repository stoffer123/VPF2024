package dk.cphbusiness.simulation;

import dk.cphbusiness.simulation.draw.Render;
import dk.cphbusiness.simulation.masses.Mass;
import dk.cphbusiness.simulation.masses.Masses;
import dk.cphbusiness.simulation.math.Vec2;

public class Simulation
{
	private final double dt = 0.005;
	private double time;
	private Masses masses;

	public Simulation()
	{
		time = 0;
		masses = new Masses();

		masses.addMass(new Mass(1, 0.5, new Vec2(2, 8), new Vec2(0,0)));
		masses.addMass(new Mass(1, 0.5, new Vec2(10, 8), new Vec2(0,0)));
	}



	public void update(double time)
	{
		while(this.time < time)
		{
			takeStep();
		}
	}

	public void render(Render render)
	{
		masses.render(render);
	}

	private void takeStep()
	{
		calculateForces();
		masses.update(dt);
		time += dt;
	}

	private void calculateForces()
	{
		for(Mass mass : masses.getMasses())
		{
			//Gravity
			mass.addForce(new Vec2(0, -9.82 * mass.getMass()));
			//Ground
			if((mass.getPosition().y-1) < mass.getRadius())
			{
				double distance = mass.getRadius() - (mass.getPosition().y-1);
				Vec2 force = new Vec2(0, distance*100);
				mass.addForce(force);
			}
		}
	}
}
