package problems;

import java.util.Scanner;

public class LeituraOtica {
    
    public static char letra(int[] v) {
        char o = 0;
        int idx = 0;
        int c = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] <= 127) {
                idx = i;
                c++;
            }
        }
        if (c == 1) {
            switch (idx) {
                case 0:
                    o = 'A';
                    break;
                case 1:
                    o = 'B';
                    break;
                case 2:
                    o = 'C';
                    break;
                case 3:
                    o = 'D';
                    break;
                case 4:
                    o = 'E';
                    break;
            }
        } else {
            o = '*';
        }
        return o;
    }
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;
        do {
            int[] v = new int[5];
            n = leia.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < v.length; j++) {
                    v[j] = leia.nextInt();
                }
                System.out.println(letra(v));
            }
        } while (n != 0);
    }
}