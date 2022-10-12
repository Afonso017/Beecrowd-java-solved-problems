package problems;

import java.util.Scanner;

public class Triangulo {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] v = new int[4];
        v[0] = leia.nextInt();
        v[1] = leia.nextInt();
        v[2] = leia.nextInt();
        v[3] = leia.nextInt();
        int menor = v[0];
        int j = 0;
        for (int i = 0; i < v.length-1; i++) {
            if (menor < v[j+1]) {
                System.out.println(menor+" é menor que "+v[j+1]);
            } else {
                System.out.println(menor+" é maior que "+v[j+1]);
                menor = v[j+1];
            }
            j++;
        }
        System.out.println("O menor é "+menor);
    }
    
}