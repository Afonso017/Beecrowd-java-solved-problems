package problems;

import java.util.Scanner;

public class Pericles {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();
        int m = leia.nextInt();
        for (int i = 0; i <= m; i++) {
            String s = leia.nextLine();
            if (s.equals("fechou")) {
                n++;
            } else if (s.equals("clicou")) {
                n--;
            }
        }
        System.out.println(n);
    }
    
}
