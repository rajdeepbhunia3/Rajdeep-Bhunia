import java.awt.*;
import java.applet.*;
/*<applet code=Ellipse width=1000 height=1000>
</applet>*/
public class Ellipse extends Applet
{	TextField t1, t2, t3,t4;
	
	public void init()
	{	t1= new TextField(10);
		t2= new TextField(10);
		t3= new TextField(10);
		t4= new TextField(10);
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
	
	}
	
	public void paint(Graphics g)
	{	int x,y,p1,p2,xc=0, yc=0,a=0, b=0, s=0;
		g.drawString("Enter the center co-ordinates in first and second box and enter major axis and minor axis in the other two respectively.",10,50);
		
		xc=Integer.parseInt(t1.getText());
		yc=Integer.parseInt(t2.getText());
		a=Integer.parseInt(t3.getText());
		b=Integer.parseInt(t4.getText());
		
		
		x=0; y=b;
		g.drawOval(xc+x,yc+y, 10,10);
		g.drawOval(xc-x,yc+y, 10,10);
		g.drawOval(xc+x,yc-y, 10,10);
		g.drawOval(xc-x,yc-y, 10,10);
		p1=(b*b)-(a*a*b)+(a*a)/4;
		while((2*b*b*x)<=(2*a*a*y))
		{	x++;
			if(p1<=0)
				p1=p1+(2*b*b*x)+(b*b);
			else
			{	y--;
				p1=p1+(2*b*b*x)+(b*b)-(2*a*a*y);
			}
			g.drawOval(xc+x,yc+y, 10,10);
			g.drawOval(xc-x,yc+y, 10,10);
			g.drawOval(xc+x,yc-y, 10,10);
			g.drawOval(xc-x,yc-y, 10,10);
			x=-x;
			g.drawOval(xc+x,yc+y, 10,10);
			g.drawOval(xc-x,yc+y, 10,10);
			g.drawOval(xc+x,yc-y, 10,10);
			g.drawOval(xc-x,yc-y, 10,10);
			x=-x;
		}
		x=a;
		y=0;
		g.drawOval(xc+x,yc+y, 10,10);
		g.drawOval(xc-x,yc+y, 10,10);
		g.drawOval(xc+x,yc-y, 10,10);
		g.drawOval(xc-x,yc-y, 10,10);
		p2=(a*a)+2*(b*b*a)+(b*b)/4;
		while((2*b*b*x)>(2*a*a*y))
		{	y++;
			if(p2>0)
				p2=p2+(a*a)-(2*a*a*y);
			else
			{	x--;
				p2=p2+(2*b*b*x)-(2*a*a*y)+(a*a);
			}
			g.drawOval(xc+x,yc+y, 10,10);
			g.drawOval(xc-x,yc+y, 10,10);
			g.drawOval(xc+x,yc-y, 10,10);
			g.drawOval(xc-x,yc-y, 10,10);
			y=-y;
			g.drawOval(xc+x,yc+y, 10,10);
			g.drawOval(xc-x,yc+y, 10,10);
			g.drawOval(xc+x,yc-y, 10,10);
			g.drawOval(xc-x,yc-y, 10,10);
			y=-y;
		}
	}
	public boolean action(Event event, Object obj)
	{	repaint();
		return true;
	}
}