package problems;

import java.util.Scanner;

public class SequenciaLogica {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();
        int v = 1;
        for (int i = 0; i < n*2; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", v);
                System.out.printf("%d ", v*v);
                System.out.printf("%d%n", v*v*v);
            } else {
                System.out.printf("%d ", v);
                System.out.printf("%d ", v*v+1);
                System.out.printf("%d%n", v*v*v+1);
            }
            if (i % 2 == 1) {
                v++;
            }
        }
    }

}