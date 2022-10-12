package problems;

import java.util.Locale;
import java.util.Scanner;

public class NotasMoedas {
    
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner leia = new Scanner(System.in);
        double n = leia.nextDouble();
        int dec = 0;
        int[] notas  = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        int[] notas_s = new int[6];
        int[] moedas_s = new int[6];
        for (int i = 0; i < 6; i++) {
            notas_s[i] = (int)n/notas[i];
            n %= notas[i];
        }
        dec = (int) (n * 100);
        for (int i = 0; i < 6; i++) {
            moedas_s[i] = (int)(dec/(moedas[i]*100));
            dec %= moedas[i]*100;
        }
        System.out.println("NOTAS:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d nota(s) de R$ %s.00\n", notas_s[i], notas[i]);
        }
        System.out.println("MOEDAS:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d moeda(s) de R$ %.2f\n", moedas_s[i], moedas[i]);
        }
    }
    
}