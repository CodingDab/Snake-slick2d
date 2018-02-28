package Snake;

import org.newdawn.slick.*;
import org.lwjgl.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame
{
	public static String title = "Snake";
	private static int menu = 0;
	private static int play = 1;
	public Game(String title)
	{
		super(title);
		this.addState(new Menu(menu));
		this.addState(new PlaySnake(play));
	}
	
	public void initStatesList(GameContainer gc)
		throws SlickException
	{
		this.getState(menu).init(gc, this);
		this.getState(play).init(gc, this);
		this.enterState(menu);
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
