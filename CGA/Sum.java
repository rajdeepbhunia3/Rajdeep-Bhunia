import java.applet.*;
import java.awt.*;
/*<applet code=Firstapp width=500 height=500>
</applet>*/
public class Sum extends Applet
{ int a,b;
TextField t1,t2,t3;
Button b1;

public void init()
{	t1=new TextField(10);
	t2=new TextField(10);
	t3=new TextField(10);
	add(t1);
	add(t2);
	add(t3);
}

public void paint(Graphics g)
{	g.drawString("Enter numbers",10,0);
	a=Integer.parseInt(t1.getText());
	b=Integer.parseInt(t2.getText());
	t3.setText(String.valueOf(a+b));
	
}

public boolean action(Event event, Object obj)
	{	repaint();
		return true;
	}

}