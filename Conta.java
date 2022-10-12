package problems;

import java.util.Scanner;

public class Conta {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int c = leia.nextInt();
        for (int i = 0; i < c; i++) {
            int n = leia.nextInt();
            if (n % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);    
            }
        }
    }

}