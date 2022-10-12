package problems;

import java.util.Scanner;

public class Tomadas {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int t1 = leia.nextInt();
        int t2 = leia.nextInt();
        int t3 = leia.nextInt();
        int t4 = leia.nextInt();
        int q = t1 + t2 + t3 + t4;
        System.out.println(q-3);
    }

}