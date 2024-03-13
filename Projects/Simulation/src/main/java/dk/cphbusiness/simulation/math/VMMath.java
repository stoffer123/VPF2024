package dk.cphbusiness.simulation.math;

public class VMMath
{
	public static Vec2 add(Vec2 a, Vec2 b)
	{
		return new Vec2(a.x + b.x, a.y + b.y);
	}

	public static Vec2 sub(Vec2 a, Vec2 b)
	{
		return new Vec2(a.x - b.x, a.y - b.y);
	}

	public static Vec2 mul(Vec2 v, double s)
	{
		return new Vec2(v.x * s, v.y * s);
	}

	public static Vec2 mul(double s, Vec2 v)
	{
		return mul(v, s);
	}

	public static Vec2 div(Vec2 v, double s)
	{
		return mul(v, 1.0 / s);
	}

	public static double dot(Vec2 a, Vec2 b)
	{
		return a.x * b.x + a.y * b.y;
	}

	public static Vec2 proj(Vec2 a, Vec2 b)
	{
		return mul(b, dot(a, b) / dot(b, b));
	}

	public static double sqrLength(Vec2 v)
	{
		return dot(v, v);
	}

	public static double length(Vec2 v)
	{
		return Math.sqrt(dot(v, v));
	}

	public static Vec2 normalize(Vec2 v)
	{
		return div(v, length(v));
	}
}
