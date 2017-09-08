package h13;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class Main extends Applet {

    public void init() {
        this.setSize(800, 400);
    }

    public void paint(Graphics g) {

        int x = 20;
        for (int i = 0; i < 12; i++) {
            Random r = new Random();
            int Low = 100;
            int High = 300;
            int size = r.nextInt(High-Low) + Low;
            DrawThree(g, x, size);

            Low = 60;
            High = 100;
            int off_x = r.nextInt(High-Low) + Low;
            x = x + off_x;
        }
    }

    private void DrawThree(Graphics g, int x, int size) {
        int amount = 24;
        g.setColor(new Color(160, 81, 31));
        g.fillRect(x, this.getHeight()-size, 30, size);

        int offset_x = -35;
        int offset_y = this.getHeight()-size-10;
        for (int i = 0; i < amount; i++) {
            if (i == 10 ) {
                offset_y = offset_y - 15;
                offset_x = offset_x = -25;
            }
            if (i == 18) {
                offset_y = offset_y - 15;
                offset_x = offset_x = -15;
            }
            g.setColor(new Color(32, 175, 87));
            g.fillRoundRect(x+offset_x, offset_y, 15, 20, 20, 20);
            offset_x = offset_x + 10;
        }
    }

}
