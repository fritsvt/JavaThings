package h2;

import java.applet.Applet;
import java.awt.*;

public class Main extends Applet {

    public void init()
    {
        setBackground(Color.white);
    }

    public void paint(Graphics g)
    {
        int width = getWidth();
        int height = getHeight();

        g.setColor(Color.blue);
        g.drawString("Frits", width/2 -10, height/2-15);

        g.setColor(Color.red);
        g.drawString("van Turnhout", width/2-40, height/2);
    }

}
