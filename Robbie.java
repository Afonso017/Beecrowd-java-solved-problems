package problems;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Robbie {

    public static void main(String[] args) {
        
        String file = "C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\URI\\src\\problems\\Arquivos\\teste.txt";
        try {
            System.setIn(new FileInputStream(new File(file)));
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
        
        Scanner leia = new Scanner(System.in);
        while (leia.hasNext()) {
            int m = leia.nextInt();
            int[] v = new int[m];
            for (int i = 0; i < m; i++) {
                v[i] = leia.nextInt();
            }
            int n = leia.nextInt();

            int s = 0;
            for (int i = m-1; i >= 0; i-=n) {
                s += v[i];
            }
            int d = 0;
            for (int i = 1; i <= s; i++) {
                if (s % i == 0) {
                    d++;
                }
            }
            if (d != 2) {
                System.out.println("Bad boy! I’ll hit you.");
            } else {
                System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
            }
        }
    }

}