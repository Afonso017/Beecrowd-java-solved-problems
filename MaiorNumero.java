package problems;

import java.util.Scanner;

public class MaiorNumero {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = 1, maior = 1;
        while (n != 0) {
            n = leia.nextInt();
            if (n > maior && n != 0) {
                maior = n;
            }
        }
        System.out.println(maior);
    }
    
}
