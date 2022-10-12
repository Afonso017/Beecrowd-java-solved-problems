package problems;

import java.util.Scanner;

public class ParcelamentoSemJuros {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int v = leia.nextInt();
        int p = leia.nextInt();
        int r = v % p;
        if (r == 0) {
            int n = v / p;
            for (int i = 0; i < p; i++) {
                System.out.println(n);
            }
        } else {
            int div = (int)v/p;
            for (int i = 0; i < p; i++) {
                if (i < r) {
                    System.out.println(div+1);
                } else {
                    System.out.println(div);
                }
            }
        }
    }
    
}
