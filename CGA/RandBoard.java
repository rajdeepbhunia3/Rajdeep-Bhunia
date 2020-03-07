/*
<applet code="RandBoard" width=500 height=500></applet>
*/
//checker board 8X8 with each random colored square
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class RandBoard extends Applet implements ActionListener
{
	Button startButton;
	public void init()
	{
		startButton=new Button("Refresh");
		add(startButton);
		startButton.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		int size=40;
		int xOff=40;
		int yOff=40;
		int n=8;
		int xPos,yPos;
		for(yPos=yOff;yPos<yOff+n*size;yPos+=size)
		{
			//Draw a row of randomly colored square
			for(xPos=xOff;xPos<xOff+n*size;xPos+=size)
			{
				g.setColor(randomColor());
				g.fillRect(xPos,yPos,size,size);
			}
		}
	}
	//randomColor() returns a random Color object 
	public Color randomColor()
	{
		float red=(float)Math.random();
		float green=(float)Math.random();
		float blue=(float)Math.random();
		return new Color(red,green,blue);
	}
	public void actionPerformed(ActionEvent evt)
	{
		repaint();
	}
}