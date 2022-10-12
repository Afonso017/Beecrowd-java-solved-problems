package problems;

import java.util.Scanner;

public class Telescopio {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a = leia.nextInt();
        int n = leia.nextInt();
        int s = 0;
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = leia.nextInt();
            if (f[i] * a >= 40000000) {
                s++;
            }
        }
        System.out.println(s);
    }

}