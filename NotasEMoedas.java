package problems;

import java.util.Scanner;

public class NotasEMoedas {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String s = leia.nextLine();
        int cem = 0, cinquenta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0;
        int um = 0, cq = 0, v = 0, d = 0, c = 0, um_cent = 0;
        double n = Double.parseDouble(s.replaceAll(",", "."));
        
        while (n >= 0.01) {
            if (n >= 100) {
                cem = (int) n/100;
                n -= cem * 100;
            } else if (n >= 50) {
                cinquenta = (int) n/50;
                n -= cinquenta * 50;
            } else if (n >= 20) {
                vinte = (int) n/20;
                n -= vinte * 20;
            } else if (n >= 10) {
                dez = (int) n/10;
                n -= dez * 10;
            } else if (n >= 5) {
                cinco = (int) n/5;
                n -= cinco * 5;
            } else if (n >= 2) {
                dois = (int) n/2;
                n -= dois * 2;
            } else if (n >= 1) {
                um = (int) n/1;
                n -= 1;
            } else if (n >= 0.50) {
                cq = (int) (n/0.50);
                n -= cq*0.50;
            } else if (n >= 0.25) {
                v = (int) (n/0.25);
                n -= v*0.25;
            } else if (n >= 0.10) {
                d = (int) (n/0.10);
                n -= d*0.1;
            } else if (n >= 0.05) {
                c = (int) (n/0.05);
                n -= c*0.05;
            } else {
                um_cent = (int) (n/0.01);
                n -= um_cent*0.01;
            }
        }
        System.out.println("NOTAS:");
        System.out.println(cem+" nota(s) de R$ 100.00");
        System.out.println(cinquenta+" nota(s) de R$ 50.00");
        System.out.println(vinte+" nota(s) de R$ 20.00");
        System.out.println(dez+" nota(s) de R$ 10.00");
        System.out.println(cinco+" nota(s) de R$ 5.00");
        System.out.println(dois+" nota(s) de R$ 2.00");
        
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00%n", um);
        System.out.printf("%d moeda(s) de R$ 0.50%n", cq);
        System.out.printf("%d moeda(s) de R$ 0.25%n", v);
        System.out.printf("%d moeda(s) de R$ 0.10%n", d);
        System.out.printf("%d moeda(s) de R$ 0.05%n", c);
        System.out.printf("%d moeda(s) de R$ 0.01%n", um_cent);
    }
    
}