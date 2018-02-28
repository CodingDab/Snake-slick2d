package Snake;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class GameBoard
{
	private Tile[] tiles;
	private Snake snake;
	public int Width;
	public int Height;
	public GameBoard(GameContainer gc)
	{
		// TODO: create tiles based on the size of the board.
		Width = gc.getScreenWidth() / Tile.Width;
		Height = gc.getScreenHeight() / Tile.Height;
		tiles = new Tile[Width * Height];
		
		for(int y = 0; y < Height; y++)
		{
			for(int x = 0; x < Width; x++)
			{
				if(x % Tile.Width == 0 && y % Tile.Height == 0)
				{
					tiles[x + Width * y] = new Tile(x * Tile.Width, y * Tile.Height);
				}
			}
		}
		snake = new Snake(3);
	}
	
	public void draw(Graphics g)
	{
		snake.draw(g);
	}
	
	public Tile getTile(int x, int y)
	{
		return tiles[x + Width * y]; // index into 2 dimensional array to get the tile
	}
}
