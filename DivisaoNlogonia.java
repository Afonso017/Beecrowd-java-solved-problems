package problems;

import java.util.Scanner;

public class DivisaoNlogonia {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int k = 0;
        String s = "";
        do {
            k = leia.nextInt();
            if (k == 0) {
                break;
            }
            int n = leia.nextInt();
            int m = leia.nextInt();
            for (int i = 0; i < k; i++) {
                int x = leia.nextInt();
                int y = leia.nextInt();
                if (x > n && y > m) {
                    s = "NE";
                } else if (x < n && y > m) {
                    s = "NO";
                } else if (x > n && y < m) {
                    s = "SE";
                } else if (x < n && y < m) {
                    s = "SO";
                } else {
                    s = "divisa";
                }
                System.out.println(s);
            }
        } while (k != 0);
    }
    
}