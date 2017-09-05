package h1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Float f = null;
        Float s = null;
        double res;
        Float r_res;

        Scanner scan = new Scanner(System.in);

        System.out.println("L337 Calculator eksdee\nEnter first number: ");
        String first = scan.next();
        try {
            f = Float.parseFloat(first);
        } catch (Exception e) {
            System.out.println("That didn't look like a number mate");
            System.exit(0);
        }

        System.out.println("Enter second number: ");
        String second = scan.next();
        try {
            s = Float.parseFloat(second);
        } catch (Exception e) {
            System.out.println("That didn't look like a number mate");
            System.exit(0);
        }

        System.out.println("Enter operator: * / + -");
        String operator = scan.next();


        switch (operator) {
            case "*":
                res = Math.round(f * s*100)/100.0d;
                System.out.println(first + " * " + second + " is " + res);
                break;
            case "/":
                res = Math.round(f / s*100)/100.0d;
                System.out.println(first + " / " + second + " is " + res);
                break;
            case "+":
                r_res =  f + s;
                res = Math.round(r_res*100)/100.0d;
                System.out.println(first + " + " + second + " is " + res);
                break;
            case "-":
                r_res =  f - s;
                res = Math.round(r_res*100)/100.0d;
                System.out.println(first + " - " + second + " is " + res);
                break;
            default:
                System.out.println("Operator not supported");
                break;
        }
    }

}
