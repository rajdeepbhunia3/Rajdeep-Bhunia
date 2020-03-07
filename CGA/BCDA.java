import java.awt.*;
import java.applet.*;
/*<applet code=BCDA width=500 height=500>
</applet>*/
public class BCDA extends Applet
{	TextField t1, t2, t3;
	public void init()
	{	t1= new TextField(10);
		t2= new TextField(10);
		t3= new TextField(10);
		
		add(t1);
		add(t2);
		add(t3);
	
		t1.setText("0");
		t2.setText("0");
		t3.setText("0");
	}
	public void paint(Graphics g)
	{	int xc=0,yc=0,r=0;
		g.drawString("Enter the center coordinates in 1st two boxes and radius in 3rd box",10,50);
		try
		{	xc=Integer.parseInt(t1.getText());
			yc=Integer.parseInt(t2.getText());
			r=Integer.parseInt(t3.getText());
		}
		catch(Exception e)
		{	
		}
		int x=0;
		int y=r;
		int p=3-2*r;
		do
		{	if(p<0)
				p=p+4*x+6;
			else
			{	p=p+4*(x-y)+10;
				y=y-1;
			}
			x=x+1;
			g.drawLine(xc+x,yc+y,xc+x,yc+y);
			g.drawLine(xc+x,yc-y,xc+x,yc-y);
			g.drawLine(xc-x,yc+y,xc-x,yc+y);
			g.drawLine(xc-x,yc-y,xc-x,yc-y);
			g.drawLine(xc+y,yc+x,xc+y,yc+x);
			g.drawLine(xc+y,yc-x,xc+y,yc-x);
			g.drawLine(xc-y,yc+x,xc-y,yc+x);
			g.drawLine(xc-y,yc-x,xc-y,yc-x);
		}	while(x<y);	
	}
	public boolean action(Event event, Object obj)
	{	repaint();
		return true;
	}
}