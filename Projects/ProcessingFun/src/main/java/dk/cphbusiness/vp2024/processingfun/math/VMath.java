package dk.cphbusiness.vp2024.processingfun.math;

public class VMath
{
	// res = a + b
	public static void add(Vec2 res, Vec2 a, Vec2 b)
	{
		res.x = a.x + b.x;
		res.y = a.y + b.y;
	}

	// res += v;
	public static void addEquals(Vec2 res, Vec2 v)
	{
		res.x += v.x;
		res.y += v.y;
	}

	//res = a - b
	public static void sub(Vec2 res, Vec2 a, Vec2 b)
	{
		res.x = a.x - b.x;
		res.y = a.y - b.y;
	}

	//res -= v
	public static void subEquals(Vec2 res, Vec2 v)
	{
		res.x -= v.x;
		res.y -= v.y;
	}

	// res = Vector from a to b
	public static void fromTo(Vec2 res, Vec2 a, Vec2 b)
	{
		res.x = b.x - a.x;
		res.y = b.y - a.y;
	}

	// res = v * s
	public static void times(Vec2 res, Vec2 v, double s)
	{
		res.x = v.x * s;
		res.y = v.y * s;
	}

	// res *= s
	public static void timesEquals(Vec2 res, double s)
	{
		res.x *= s;
		res.y *= s;
	}

	//a dot b
	public static double dot(Vec2 a, Vec2 b)
	{
		return a.x*b.x + a.y*b.y;
	}



	public static double sqrLength(Vec2 v)
	{
		return v.x*v.x + v.y*v.y;
	}

	public static double length(Vec2 v)
	{
		return Math.sqrt(v.x*v.x + v.y*v.y);
	}

	public static void projectAonB(Vec2 res, Vec2 a, Vec2 b)
	{
		times(res, b, dot(a,b) / sqrLength(b));
	}

	//Transformations

	// m00, m01, tx
	// m10, m11, ty
	// 0,   0,   1

	//Create id transformation
	public static void id(Transformation2D res)
	{
		res.m00 = 1.0;
		res.m01 = 0.0;
		res.m10 = 0.0;
		res.m11 = 1.0;
		res.tx = 0.0;
		res.ty = 0.0;
	}

	//Create CounterClockwise Rotation
	public static void rotateCCW(Transformation2D res, double angle)
	{
		double cos = Math.cos(angle);
		double sin = Math.sin(angle);
		res.m00 = cos;
		res.m01 = -sin;
		res.m10 = sin;
		res.m11 = cos;
		res.tx = 0.0;
		res.ty = 0.0;
	}

	//Create Clockwise Rotation
	public static void rotateCW(Transformation2D res, double angle)
	{
		double cos = Math.cos(angle);
		double sin = Math.sin(angle);
		res.m00 = cos;
		res.m01 = sin;
		res.m10 = -sin;
		res.m11 = cos;
		res.tx = 0.0;
		res.ty = 0.0;
	}

	//Create translation
	public static void translate(Transformation2D res, Vec2 t)
	{
		res.m00 = 1.0;
		res.m01 = 0.0;
		res.m10 = 0.0;
		res.m11 = 1.0;
		res.tx = t.x;
		res.ty = t.y;
	}

	//create uniform scale
	public static void scale(Transformation2D res, double s)
	{
		res.m00 = s;
		res.m01 = 0.0;
		res.m10 = 0.0;
		res.m11 = s;
		res.tx = 0.0;
		res.ty = 0.0;
	}

	//create non-uniform scale
	public static void scale(Transformation2D res, double sx, double sy)
	{
		res.m00 = sx;
		res.m01 = 0.0;
		res.m10 = 0.0;
		res.m11 = sy;
		res.tx = 0.0;
		res.ty = 0.0;
	}

	// Matrix multiplication
	// res = a * b
	public static void mul(Transformation2D res, Transformation2D a, Transformation2D b)
	{
		res.m00 = a.m00 * b.m00 + a.m01 * b.m10;
		res.m01 = a.m00 * b.m01 + a.m01 * b.m11;
		res.tx = a.m00 * b.tx + a.m01 * b.ty + a.tx;
		res.m10 = a.m10 * b.m00 + a.m11 + b.m10;
		res.m11 = a.m10 * b.m01 + a.m11 * b.m11;
		res.ty = a.m10 * b.tx + a.m11 * b.ty + a.ty;
	}

	// res *= t
	public static void mulEquals(Transformation2D res, Transformation2D t)
	{
		double m00 = res.m00 * t.m00 + res.m01 * t.m10;
		double m01 = res.m00 * t.m01 + res.m01 * t.m11;
		double tx = res.m00 * t.tx + res.m01 * t.ty + res.tx;
		double m10 = res.m10 * t.m00 + res.m11 + t.m10;
		double m11 = res.m10 * t.m01 + res.m11 * t.m11;
		double ty = res.m10 * t.tx + res.m11 * t.ty + res.ty;
		res.m00 = m00;
		res.m01 = m01;
		res.m10 = m10;
		res.m11 = m11;
		res.tx = tx;
		res.ty = ty;
	}

	// res = t * res
	public static void equalsMul(Transformation2D t, Transformation2D res)
	{
		double m00 = t.m00 * res.m00 + t.m01 * res.m10;
		double m01 = t.m00 * res.m01 + t.m01 * res.m11;
		double tx = t.m00 * res.tx + t.m01 * res.ty + t.tx;
		double m10 = t.m10 * res.m00 + t.m11 + res.m10;
		double m11 = t.m10 * res.m01 + t.m11 * res.m11;
		double ty = t.m10 * res.tx + t.m11 * res.ty + t.ty;
		res.m00 = m00;
		res.m01 = m01;
		res.m10 = m10;
		res.m11 = m11;
		res.tx = tx;
		res.ty = ty;
	}

	// res = inverse(t)
	public static void invert(Transformation2D res, Transformation2D t)
	{
		double invDet = 1.0 / (t.m00 * t.m11 - t.m01 * t.m10);
		res.m00 = t.m11 * invDet;
		res.m01 = -t.m01 * invDet;
		res.m10 =  -t.m10 * invDet;
		res.m11 = t.m00 * invDet;
		res.tx = ((t.m01 * t.ty) - (t.m11 * t.tx)) * invDet;
		res.ty = ((t.m10 * t.tx) - (t.m00 * t.ty)) * invDet;
	}

	// t = inverse(t)
	public static void invertEquals(Transformation2D t)
	{
		double invDet = 1.0 / (t.m00 * t.m11 - t.m01 * t.m10);
		double m00 = t.m11 * invDet;
		double m01 = -t.m01 * invDet;
		double m10 =  -t.m10 * invDet;
		double m11 = t.m00 * invDet;
		double tx = ((t.m01 * t.ty) - (t.m11 * t.tx)) * invDet;
		double ty = ((t.m10 * t.tx) - (t.m00 * t.ty)) * invDet;
		t.m00 = m00;
		t.m01 = m01;
		t.m10 =  m10;
		t.m11 = m11;
		t.tx = tx;
		t.ty = ty;
	}

	public static void transformNormal(Vec2 res, Transformation2D t, Vec2 norm)
	{
		res.x = t.m00 * norm.x + t.m01 * norm.y;
		res.y = t.m10 * norm.x + t.m11 * norm.y;
	}

	public static void transform(Vec2 res, Transformation2D t, Vec2 v)
	{
		res.x = t.m00 * v.x + t.m01 * v.y + t.tx;
		res.y = t.m10 * v.x + t.m11 * v.y + t.ty;
	}
}
