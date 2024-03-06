package dk.cphbusiness.evu.vp.f2024.stackandheap;

public class Vector3f
{
	public final float x;
	public final float y;
	public final float z;

	public Vector3f(float x, float y, float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString()
	{
		return "Vector3f{" +
			"x=" + x +
			", y=" + y +
			", z=" + z +
			'}';
	}
}
