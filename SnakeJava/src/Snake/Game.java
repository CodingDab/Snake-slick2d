package Snake;

import org.newdawn.slick.*;
import org.lwjgl.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame
{
	public static String title = "Snake";
	private static int[] state = {0, 1};
	public Game(String title)
	{
		super(title);
		this.addState(new Menu(state[0]));
	}
	
	public void initStatesList(GameContainer gc)
		throws SlickException
	{
		this.getState(state[0]).init(gc, this);
		this.enterState(state[0]);
	}
	
	public static void main(String[] args) 
	{
		AppGameContainer wnd;
		try
		{
			wnd = new AppGameContainer(new Game(title));
			wnd.setDisplayMode(800, 600, false); // small for now
			wnd.setShowFPS(false); // the fps will be enabled during testing only
			wnd.setVSync(true); // vsync makes things go smooth but depending on performance i may remove it later on
			wnd.start();
		}
		catch(SlickException e)
		{
			e.printStackTrace();
		}
	}

}
