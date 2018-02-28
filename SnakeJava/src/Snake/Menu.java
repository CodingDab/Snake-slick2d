package Snake;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

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
		g.drawImage(titleImage, gc.getScreenWidth()/2 - titleImage.getWidth() * 7/6, 50f);
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
