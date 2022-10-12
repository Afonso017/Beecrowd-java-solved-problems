package problems;

import java.util.*;

public class SortSimples {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a = leia.nextInt();
        int b = leia.nextInt();
        int c = leia.nextInt();
        if (a < b && a < c) {
            System.out.println(a);
            if (b < c) {
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b < a && b < c) {
            System.out.println(b);
            if (a < c) {
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
            }
        } else {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        System.out.println("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
