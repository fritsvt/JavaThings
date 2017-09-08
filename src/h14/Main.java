package h14;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

public class Main extends Applet {

    private Image afbeelding;
    private URL pad;
    private TextField input;
    private Button button;
    private int left = 23;
    private int wins = 0;
    private int lost = 0;


    public void init() {
        input = new TextField("", 20);
        add(input);

        button = new Button("Add");
        ButtonListener bl = new ButtonListener();
        button.addActionListener( bl );
        add(button);

        pad = Main.class.getResource("/h14/");
        afbeelding = getImage(pad, "smiley.png");

        this.setSize(420, 180);
    }

    public void paint(Graphics g) {
        g.drawString("Win: " + wins + " lost: " + lost, 10, 50);

        int x = 10;
        int y = 60;
        for (int i = 0; i < left; i++) {
            if (i == 10 || i == 20) {
                y = y + 40;
                x = 10;
            }
            g.drawImage(afbeelding, x, y, 30, 30, this);
            x = x + 40;
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            boolean error = false;
            String input_string = input.getText();
            int amount = 0;
            try {
                amount = Integer.parseInt(input_string);
            } catch (Exception ex) {
                error = true;
                JOptionPane.showMessageDialog(null, "Invalid number");
            }

            if (!error) {
                if (amount < 1 || amount > 3) {
                    JOptionPane.showMessageDialog(null, "Number must be between 1 and 3");
                } else {
                    boolean reset = false;
                    left = left - amount;
                    if (left < 1) {
                        JOptionPane.showMessageDialog(null, "You lost!");
                        lost = lost + 1;
                        reset = true;
                    }

                    // perform cpu move
                    if (left > 5) {
                        Random r = new Random();
                        int cpu = r.nextInt(4-1) + 1;
                        left = left - cpu;
                    } else {
                        int move = left - 1;
                        if (move < 1) {
                            move = 1;
                        }
                        left = left - move;
                    }
                    if (left == 0) {
                        JOptionPane.showMessageDialog(null, "You won!");
                        wins = wins + 1;
                        left = 23;
                        reset = true;
                    }

                    if (reset) {
                        left = 23;
                    }
                }
            }
            repaint();
        }
    }

}
