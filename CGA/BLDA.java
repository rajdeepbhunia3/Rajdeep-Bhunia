import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;
/*<applet code=BLDA width=500 height=500>
</applet>*/
public class BLDA extends Applet
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
	{	int x1=0,y1=0,x2=0,y2=0;
		g.drawString("Enter the coordinates in each box and press enter",10,50);
		try
		{	x1=Integer.parseInt(t1.getText());
			y1=Integer.parseInt(t2.getText());
			x2=Integer.parseInt(t3.getText());
			y2=Integer.parseInt(t4.getText());
		}
		catch(Exception e)
		{	
		}
		int x,y,k;
		double dx,dy,p;
		
		dx=Math.abs(x2-x1);
		dy=Math.abs(y2-y1);
		x=x1;
		y=y1;
		p=2*dy-dx;
		for(k=0;k<dx;k++)
		{	if(p<0)
			{	g.fillOval(x++,y,5,5);
				p=p+(2*dy);
			}
			else
			{	g.fillOval(x++,y++,5,5);
				p=p+(2*(dy-dx));
			}
		}
	}
	public boolean action(Event event, Object obj)
	{	repaint();
		return true;
	}
}