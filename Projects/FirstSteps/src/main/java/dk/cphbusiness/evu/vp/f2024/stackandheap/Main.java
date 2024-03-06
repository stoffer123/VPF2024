package dk.cphbusiness.evu.vp.f2024.stackandheap;

public class Main
{
	public static void main(String[] args)
	{
		Vector3f vec1 = new Vector3f(1,1,1);
		Vector3f vec2 = vec1;
		Vector3f vec3 = add(vec1, vec2);
		System.out.println(vec3);
		vec3 = null;

	}

	public static Vector3f add(Vector3f a, Vector3f b)
	{
		return new Vector3f(a.x + b.x, a.y + b.y, a.z + b.z);
	}
}
