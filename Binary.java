package problems;

import java.util.Scanner;

public class Binary {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();
        char[] c = Integer.toString(n).toCharArray();
        if (c.length < 8) {
            for (int i = 0; i < 8 - c.length; i++) {
                
            }
        }
        System.out.println(c);
    }
    
}
