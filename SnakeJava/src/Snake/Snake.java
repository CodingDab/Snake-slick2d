package Snake;

import org.newdawn.slick.*;

public class Snake
{
	private Link[] snakeLinks;
	public Snake(int length)
	{
		snakeLinks = new Link[length];
	}
	public void draw(Graphics g)
	{
		for(int i = 0; i < snakeLinks.length; i++)
		{
			snakeLinks[i].draw(g);
		}
	}
	public void Add(Link newLink)
	{
		Link[] temp = new Link[snakeLinks.length + 1];
		for(int i = 0; i < snakeLinks.length; i++)
		{
			temp[i] = snakeLinks[i];
		}
		temp[temp.length] = newLink;
		
		snakeLinks = temp;
	}
}
