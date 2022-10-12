package problems;

import java.util.Scanner;

public class Chá {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int t = leia.nextInt();
        int[] v = new int[5];
        for (int i = 0; i < 5; i++) {
            v[i] = leia.nextInt();
        }
        int n = 0;
        for (int i : v) {
            if (i == t) {
                n++;
            }
        }
        System.out.println(n);
    }

}