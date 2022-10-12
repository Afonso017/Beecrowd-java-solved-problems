package problems;

import java.util.Locale;
import java.util.Scanner;

public class CrescimentoPopulacional {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        leia.useLocale(Locale.ENGLISH);
        int t = leia.nextInt();
        int pa = 0, pb = 0;
        double g1 = 0, g2 = 0;
        for (int i = 0; i < t; i++) {
            pa = leia.nextInt();
            pb = leia.nextInt();
            g1 = leia.nextDouble();
            g2 = leia.nextDouble();
            int anos = 0;
            while (pa <= pb) {
                if (anos > 100) {
                    break;
                }
                pa += (pa * g1) / 100;
                pb += (pb * g2) / 100;
                anos++;
            }
            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }
    }
    
}
