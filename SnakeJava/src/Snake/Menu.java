package Snake;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.*;

public class Menu extends BasicGameState
{
	private int id;
	private Image titleImage;
	public Menu(int id)
	{
		this.id = id;
	}
	
	public void init(GameContainer gc, StateBasedGame sbg)
		throws SlickException
	{
		titleImage = new Image("../SnakeJava/res/images/snaketitleimage.png");
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
		throws SlickException
	{
		g.setColor(Color.blue);
		g.drawString("Developed by 'Java' 2018.", 265, 580);
		g.drawImage(titleImage, gc.getScreenWidth()/2 - titleImage.getWidth() * 7/6, 50f); // just looked nice 
		// the png format may be messing with my math, because ratio was messed up when i changed sizes
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
		throws SlickException
	{
		// will create a more complex menu later on
		if(Keyboard.isKeyDown(Keyboard.KEY_RETURN)) sbg.enterState(1); // enter the "play" state
	}
	
	public int getID()
	{
		return id;
	}
}
