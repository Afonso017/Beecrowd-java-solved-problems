package problems;

import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        double a = leia.nextDouble();
        double b = leia.nextDouble();
        double c = leia.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        double r1 = (- b + Math.sqrt(delta)) / (2 * a);
        double r2 = (- b - Math.sqrt(delta)) / (2 * a);
        if ((a != 0 && b != 0 && c != 0) && (delta > 0)) {
            String r = String.format("%.5f", r1).replaceAll(",", ".");
            System.out.printf("R1 = %s\n", r);
            r = String.format("%.5f", r2).replaceAll(",", ".");
            System.out.printf("R2 = %s\n", r);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
    
}