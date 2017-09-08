package h14;

import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Kaarten extends Applet {

    private ArrayList<String> kaarten = new ArrayList<String>();
    private String[] colors = {"Harten", "Ruiten", "Schoppen", "Klaver"};
    private String[] types = {"tien", "negen", "acht", "zeven", "zes", "vijf", "vier", "drie", "twee", "boer", "aas", "vrouw", "heer"};

    public void init() {
        this.setSize(550, 300);

        for (String i : colors) {
            for (String x : types) {
                kaarten.add(i + " " + x);
            }
        }

        Collections.shuffle(kaarten);

        System.out.println(kaarten.size());
    }

    public void paint(Graphics g) {
        int x_offset = 20;
        int y_offset = 30;
        int row = 0;
        for (String kaart : kaarten) {
            if (row == 13) {
                g.drawString("Speler 1", x_offset, 20);
                x_offset = x_offset + 140;
                y_offset = 30;
            } else if (row == 26) {
                g.drawString("Speler 2", x_offset, 20);
                x_offset = x_offset + 140;
                y_offset = 30;
            } else if (row == 39) {
                g.drawString("Speler 3", x_offset, 20);
                x_offset = x_offset + 140;
                y_offset = 30;
            } else if (row == 51){
                g.drawString("Speler 4", x_offset, 20);
            }
            row = row +1;
            y_offset = y_offset + 20;

            g.drawString(kaart, x_offset, y_offset);
        }
    }

}
