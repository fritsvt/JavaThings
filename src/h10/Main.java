package h10;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Arrays;

public class Main extends Applet {

    private TextField input;
    private Button submit;
    private int grade;
    private String[] allowed = {"1","2","3","4","5","6","7","8","9","10"};

    public void init()
    {
        this.setSize(400, 50);

        input = new TextField("", 20);
        add(input);

        submit = new Button("Berekenen");
        SubmitButtonListener sml = new SubmitButtonListener();
        submit.addActionListener( sml );
        add(submit);
    }

    class SubmitButtonListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            boolean error = false;

            String input_string = input.getText();
            if (!Arrays.asList(allowed).contains(input_string)) {
                JOptionPane.showMessageDialog(null, "Cijfer moet tussen 1 en 10 zijn");
                error = true;
            }

            if (!error) {
                grade = Integer.parseInt(input_string);

                if (grade < 4) {
                    JOptionPane.showMessageDialog(null, "Slecht cijfer");
                } else if (grade == 4) {
                    JOptionPane.showMessageDialog(null, "Onvoldoende");
                } else if (grade == 5) {
                    JOptionPane.showMessageDialog(null, "Matig");
                } else if (grade == 6 || grade == 7) {
                    JOptionPane.showMessageDialog(null, "Voldoende");
                } else {
                    JOptionPane.showMessageDialog(null, "Goed cijfer");
                }
            }

        }
    }

}
