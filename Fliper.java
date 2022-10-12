package problems;

import java.util.Scanner;

public class Fliper {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int p = leia.nextInt();
        int r = leia.nextInt();
        if (p == 1) {
            if (r == 1) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        } else {
            System.out.println("C");
        }
    }

}