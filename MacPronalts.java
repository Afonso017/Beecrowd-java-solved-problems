package problems;

import java.util.Locale;
import java.util.Scanner;

public class MacPronalts {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        int c = leia.nextInt();
        double t = 0.0;
        for (int i = 0; i < c; i++) {
            int p = leia.nextInt();
            int q = leia.nextInt();
            switch (p) {
                case 1001:
                    t += q*1.5;
                    break;
                case 1002:
                    t += q*2.5;
                    break;
                case 1003:
                    t += q*3.5;
                    break;
                case 1004:
                    t += q*4.5;
                    break;
                case 1005:
                    t += q*5.5;
                    break;
            }
        }
        System.out.printf("%.2f\n", t);
    }
    
}