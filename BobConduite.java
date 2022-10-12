package problems;

import java.util.Scanner;

public class BobConduite {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int t = leia.nextInt();
        while (t > 0) {
            int r1 = leia.nextInt();
            int r2 = leia.nextInt();
            System.out.println(r1 + r2);
            t--;
        }
    }

}