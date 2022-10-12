package problems;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();
        int f = 1;
        int a = 1;
        for (int i = 0; i < n; i++) {
            a = n-i;
            f *= a;
        }
        System.out.println(f);
    }

}