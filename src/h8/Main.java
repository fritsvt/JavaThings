package h8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Main extends Applet {
    private TextField input0;
    private TextField input1;
    private Label label;

    private Button Keer;
    private Button Delen;
    private Button Plus;
    private Button Min;

    private Double num1;
    private Double num2;
    private double answer;


    public void init() {
        input0 = new TextField("", 20);
        add(input0);

        input1 = new TextField("", 20);
        add(input1);

        Keer = new Button("*");
        KeerButtonListener ke = new KeerButtonListener();
        Keer.addActionListener( ke );
        add(Keer);

        Delen = new Button("/");
        DelenButtonListener dl = new DelenButtonListener();
        Delen.addActionListener( dl );
        add(Delen);

        Plus = new Button("+");
        PlusButtonListener pl = new PlusButtonListener();
        Plus.addActionListener( pl );
        add(Plus);



        Min = new Button("-");
        MinButtonListener ml = new MinButtonListener();
        Min.addActionListener( ml );
        add(Min);
    }

    public void paint(Graphics g) {
        this.setSize(400, 80);
        g.drawString("Het antwoord is: " + answer, 140, 80);
    }


    class KeerButtonListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String num1_s = input0.getText();
            if (num1_s.equals("")) {
                num1 = 0.0;
            } else {
                num1 = Double.parseDouble(num1_s);
            }

            String num2_s = input1.getText();
            if (num2_s.equals("")) {
                num2 = 0.0;
            } else {
                num2 = Double.parseDouble(num2_s);
            }
            answer = Calculation.calculate(num1, num2, "*");
            repaint();
        }
    }

    class DelenButtonListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String num1_s = input0.getText();
            if (num1_s.equals("")) {
                num1 = 0.0;
            } else {
                num1 = Double.parseDouble(num1_s);
            }

            String num2_s = input1.getText();
            if (num2_s.equals("")) {
                num2 = 0.0;
            } else {
                num2 = Double.parseDouble(num2_s);
            }
            answer = Calculation.calculate(num1, num2, "/");
            repaint();
        }
    }

    class PlusButtonListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String num1_s = input0.getText();
            if (num1_s.equals("")) {
                num1 = 0.0;
            } else {
                num1 = Double.parseDouble(num1_s);
            }

            String num2_s = input1.getText();
            if (num2_s.equals("")) {
                num2 = 0.0;
            } else {
                num2 = Double.parseDouble(num2_s);
            }
            answer = Calculation.calculate(num1, num2, "+");
            repaint();
        }
    }

    class MinButtonListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String num1_s = input0.getText();
            if (num1_s.equals("")) {
                num1 = 0.0;
            } else {
                num1 = Double.parseDouble(num1_s);
            }
            System.out.println(num1);

            String num2_s = input1.getText();
            if (num2_s.equals("")) {
                num2 = 0.0;
            } else {
                num2 = Double.parseDouble(num2_s);
            }

            answer = Calculation.calculate(num1, num2, "-");
            repaint();
        }
    }
}
