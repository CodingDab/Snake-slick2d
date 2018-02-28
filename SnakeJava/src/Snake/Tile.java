package Snake;

import org.newdawn.slick.*;

public class Tile
{
	public static int Height = 5;
	public static int Width = 5;
	private int x;
	private int y;
	
	public Tile(int in_x, int in_y)
	{
		x = in_x;
		y = in_y;
	}
	
	public float getX()
	{
		return (float)x;
	}
	
	public float getY()
	{
		return (float)y;
	}
}
