package problems;

import java.util.Scanner;

public class Pares {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int c = 0;
        for (int i = 0; i < 5; i++) {
            int n = leia.nextInt();
            if (n % 2 == 0) {
                c++;
            }
        }
        System.out.println(c+" valores pares");
    }

}