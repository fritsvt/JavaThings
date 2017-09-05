package h4;

import java.awt.*;
import java.applet.*;

public class Main extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        this.setSize(350, 140);

        setBackground(Color.white);
        g.setColor(Color.black);

        g.drawLine(10,10,100,10);

        g.drawRect(10,20,100,50);
        g.drawRoundRect(10, 80, 100, 50, 10, 10);

        g.setColor(Color.magenta);
        g.fillRect(120, 20, 100, 50);
        g.setColor(Color.black);
        g.drawOval(120, 20, 100, 50);

        g.setColor(Color.magenta);
        g.fillOval(120, 80, 100, 50);

        g.setColor(Color.black);
        g.drawOval(230, 20, 100, 50);
        g.setColor(Color.magenta);
        g.fillArc(230, 20, 100, 50, 0,  40);

        g.setColor(Color.black);
        g.drawOval(255, 80, 50, 50);
    }

}
