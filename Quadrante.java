package problems;

import java.util.Scanner;

public class Quadrante {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int x = 1;
        int y = 1;
        do {
            x = leia.nextInt();
            y = leia.nextInt();
            if (x == 0 || y == 0) {
                break;
            }
            if (x > 0) {
                if (y > 0) {
                    System.out.println("primeiro");
                } else {
                    System.out.println("quarto");
                }
            } else {
                if (y > 0) {
                    System.out.println("segundo");
                } else {
                    System.out.println("terceiro");
                }
            }
        } while (x != 0 || y != 0);
    }

}