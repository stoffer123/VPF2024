package dk.cphbusiness.vp2024.processingfun.intf;

public interface Render
{
	void size(int xSize, int ySize);
	void background(int color);
	void fill(int color);
	void circle(int x, int y, int radius);
}
