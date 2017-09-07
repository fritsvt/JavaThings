package h12;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main extends Applet {

    private TextField input_name;
    private TextField input_tel;
    private Button submit;

    private ArrayList<String> names = new ArrayList<String>();
    private ArrayList<String> tels = new ArrayList<String>();

    public void init() {
        this.setSize(500, 250);

        input_name = new TextField("", 20);
        add(input_name);

        input_tel = new TextField("", 20);
        add(input_tel);

        submit = new Button("Add");
        ButtonListener bl = new ButtonListener();
        submit.addActionListener( bl );
        add(submit);
    }

    public void paint(Graphics g) {
        if (names.size() > 9) {
            int y = 60;
            for (int i = 0; i < names.size(); i++) {
                g.drawString("Naam: " + names.get(i) + " tel: " + tels.get(i), 40, y);
                y = y + 20;
            }
        } else {
            g.drawString("Vul 10 namen en telefoonnummers in om de lijst te laten zien", 40, 60);
        }
    }


    class ButtonListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String name = input_name.getText();
            String tel = input_tel.getText();

            if (names.size() <= 10) {
                names.add(name);
                tels.add(tel);
            } else {
                JOptionPane.showMessageDialog(null, "Je hebt er al 10");
            }

            input_name.setText("");
            input_tel.setText("");

            repaint();
        }
    }

}
