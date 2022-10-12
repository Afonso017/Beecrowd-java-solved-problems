package problems;

import java.util.Scanner;

public class Pascal {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int t = leia.nextInt();
        int s = 0;
        for (int i = 0; i < t; i++) {
            int n = leia.nextInt();
            for (int j = 0; j < n; j++) {
                s += (int) Math.pow(2, j);
            }
            System.out.println(s);
            s = 0;
        }
    }

}