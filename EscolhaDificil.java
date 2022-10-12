package problems;

import java.util.Scanner;

public class EscolhaDificil {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int f = leia.nextInt();
        int b = leia.nextInt();
        int m = leia.nextInt();
        int ef = leia.nextInt();
        int eb = leia.nextInt();
        int em = leia.nextInt();
        int coitados = 0;
        if (ef > f) {
            coitados += ef - f;
        }
        if (eb > b) {
            coitados += eb - b;
        }
        if (em > m) {
            coitados += em - m;
        }
        System.out.println(coitados);
    }

}