package problems;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();
        if (n <= 100 && n >= 86 ) {
            System.out.println("A");
        } else if (n <= 85 && n >= 61) {
            System.out.println("B");
        } else if (n <= 60 && n >= 36) {
            System.out.println("C");
        } else if (n <= 35 && n >= 1) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }

}