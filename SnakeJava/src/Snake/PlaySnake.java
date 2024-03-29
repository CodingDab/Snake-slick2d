package Snake;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class PlaySnake extends BasicGameState
{
	private int id;
	private GameBoard gb;
	public PlaySnake(int id)
	{
		this.id = id;
	}
	
	public void init(GameContainer gc, StateBasedGame sbg)
		throws SlickException
	{
		gb = new GameBoard(gc);
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
		throws SlickException
	{
		
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
		throws SlickException
	{
		
	}
	
	public int getID()
	{
		return id;
	}
}
