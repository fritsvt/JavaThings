package h8;
import h6.Round;

class Calculation {

    public static double calculate(double num1, double num2, String type) {

        switch (type) {
            case "*":
                return Round.round(num1 * num2, 2);
            case "/":
                return Round.round(num1 / num2, 2);
            case "+":
                return Round.round(num1 + num2, 2);
            case "-":
                return Round.round(num1 - num2, 2);
            default:
                System.out.println("Operator not supported");
                break;
        }
        return 0.0;
    }

}
