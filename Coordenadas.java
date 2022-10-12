package problems;

import java.util.*;

public class Coordenadas {
    
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner leia = new Scanner(System.in);
        double x = leia.nextDouble();
        double y = leia.nextDouble();
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        } else if (y == 0 && x != 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
    }
    
}
