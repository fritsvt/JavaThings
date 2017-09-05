package h5;

import java.awt.*;
import java.applet.*;

public class Main extends Applet {

    private int max = 100;
    private int min = 0;
    private int[] ppl = {40, 90, 80, 35};
    private String[] names = {"Valerie","Jeroen", "Hans", "Piet"};

    public void init() {
        int w = ppl.length * 80;
        if (w > 1000) {
            w = 1000;
        }
        this.setSize(w + 20, 140);
    }

    public void paint(Graphics g) {
        int i = 0;
        for (int p : ppl) {
            int offset_x = 10 + i * 80;
            g.setColor(Color.black);
            g.fillRect(offset_x,10,30,100);
            g.drawRect(offset_x, 10, 30, 100);
            g.drawString(names[i], offset_x, 122);
            g.setColor(Color.white);
            g.fillRect(offset_x,  10, 30, 100-p);
            i++;
        }
    }

}
