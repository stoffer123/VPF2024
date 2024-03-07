package dk.cphbusiness.vp2024.processingfun.intf;

public interface Canvas
{
	void background(int color);
	void fill(int color);
	void noFill();
	void stroke(int color);
	void strokeWidth(float width);

	//Shapes
	void circle(float xPos, float yPos, float radius);
	void line(float x1, float y1, float x2, float y2);
}
