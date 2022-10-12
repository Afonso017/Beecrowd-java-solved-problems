package problems;

import java.util.Scanner;

public class Evento {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int x = leia.nextInt();
        int m = leia.nextInt();
        while (x != 0 && m != 0) {
            System.out.println(x * m);
            x = leia.nextInt();
            m = leia.nextInt();
        }
    }
    
}