import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;
/*<applet code=DDA width=500 height=500>
</applet>*/
public class DDA extends Applet
{	TextField t1, t2, t3, t4;
	public void init()
	{	t1= new TextField(10);
		t2= new TextField(10);
		t3= new TextField(10);
		t4= new TextField(10);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		t1.setText("0");
		t2.setText("0");
		t3.setText("0");
		t4.setText("0");
	}
	public void paint(Graphics g)
	{	double x1=0,y1=0,x2=0,y2=0;
		g.drawString("Enter the coordinates in each box and press enter",10,50);
		try
		{	x1=Double.parseDouble(t1.getText());
			y1=Double.parseDouble(t2.getText());
			x2=Double.parseDouble(t3.getText());
			y2=Double.parseDouble(t4.getText());
		}
		catch(Exception e)
		{	
		}
		double dx,dy,steps,x,y,k,xc,yc;
		dx=x2-x1;
		dy=y2-y1;
		if(Math.abs(dx)>Math.abs(dy))
			steps=Math.abs(dx);
		else
			steps=Math.abs(dy);
		xc=dx/steps;
		yc=dy/steps;
		x=x1;
		y=y1;
		g.fillOval((int)x1,(int)y1,5,5);
		for(k=1;k<=steps;k++)
		{	x=x+xc;
			y=y+yc;
			g.fillOval((int)x, (int)y,5,5);
		}
	}
	public boolean action(Event event, Object obj)
	{	repaint();
		return true;
	}
}