package dk.cphbusiness.dk.simulation.masses;

import dk.cphbusiness.dk.simulation.math.VMMath;
import dk.cphbusiness.dk.simulation.math.Vec2;

public class Mass
{
	private double mass;
	private double radius;
	private Vec2 lastPosition;
	private Vec2 position;
	private Vec2 velocity;
	private Vec2 force;

	public Mass(double mass, double radius, Vec2 position, Vec2 velocity)
	{
		this.mass = mass;
		this.radius = radius;
		this.position = position;
		this.velocity = velocity;
		this.force = new Vec2(0, 0);
		this.lastPosition = position;
	}

	public double getMass()
	{
		return mass;
	}

	public double getRadius()
	{
		return radius;
	}

	public Vec2 getPosition()
	{
		return position;
	}

	public Vec2 getVelocity()
	{
		return velocity;
	}

	public Vec2 getForce()
	{
		return force;
	}

	public void addForce(Vec2 force)
	{
		this.force = VMMath.add(this.force, force);
	}

	public void update(double dt)
	{
		Vec2 acceleration = VMMath.div(force, mass);
		velocity = VMMath.add(velocity, VMMath.mul(acceleration, dt));
		lastPosition = VMMath.add(lastPosition, VMMath.mul(velocity, dt));
		position = VMMath.add(lastPosition, VMMath.mul(velocity, 0.5 * dt));
		force = new Vec2(0, 0);
	}

}
