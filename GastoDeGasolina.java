package problems;

import java.util.Scanner;

public class GastoDeGasolina {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int t = leia.nextInt();
        int v = leia.nextInt();
        int d = v * t;
        double l = (double) d / 12;
        String s = String.format("%.3f", l).replaceAll(",", ".");
        System.out.println(s);
    }

}