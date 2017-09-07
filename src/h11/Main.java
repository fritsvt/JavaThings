package h11;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Applet {

    private TextField input;
    private Button button;
    private String tafels;
    private int tafel = 0;
    private boolean error = true;

    public void init() {
        input = new TextField("", 20);
        add(input);

        button = new Button("Go!");
        ButtonListener bl = new ButtonListener();
        button.addActionListener( bl );
        add(button);
    }

    public void paint(Graphics g) {
        this.setSize(400, 250);

        int y = 60;
        if (!error) {
            for (int i = 1; i < 11; i++) {
                g.drawString(i + " * " + tafel + " = " + i * tafel, 75, y);
                y = y + 20;
            }
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String num = input.getText();

            try {
                tafel = Integer.parseInt(num);
                error = false;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid number");
                error = true;
            }
            repaint();
        }
    }

}
