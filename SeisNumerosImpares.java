package problems;

import java.util.Scanner;

public class SeisNumerosImpares {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int x = leia.nextInt();
        for (int i = 0; i < 6; i++) {
            if (x % 2 == 0) {
                x += 1;
                System.out.println(x);
            } else {
                System.out.println(x);
            }
            x += 2;
        }
    }

}