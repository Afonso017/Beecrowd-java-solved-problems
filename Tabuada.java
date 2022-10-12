package problems;

import java.util.Scanner;

public class Tabuada {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", i, n, i*n);
        }
    }
}