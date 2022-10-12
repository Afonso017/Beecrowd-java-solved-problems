package problems;

import java.util.Scanner;

public class SaldoDoVovo {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();
        int s = leia.nextInt();
        int[] v = new int[n];
        int[] d = new int[v.length];
        for (int i = 0; i < n; i++) {
            v[i] = leia.nextInt();
            d[i] = s + v[i];
            s = d[i];
        }
        int menor = d[0];
        for (int i = 0; i < d.length; i++) {
            if (d[i] < menor) {
                menor = d[i];
            }
        }
        System.out.println(menor);
    }
    
}
