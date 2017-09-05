package h6;

import h6.Round;

public class Main {

    private static Double[] cijfers = {5.9, 6.3, 6.9};

    public static void main(String[] args) {
        double total = 0;
        for(double c : cijfers) {
            total = total + c;
        }
        double gem = total / cijfers.length;
        System.out.print("Gemiddelde cijfer: " + Round.round(gem, 2));
    }
}
