package problems;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

public class Estiagem_Try {
    
    public static void main(String[] args) {
        
        String path = "C:\\Users\\Lenovo\\Desktop\\Archives Project - NetBeans\\estiagem.txt";
        try {
            System.setIn(new FileInputStream(new File(path)));
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
        
        Scanner leia = new Scanner(System.in);
        HashMap<Integer,ArrayList<int[]>> h = new HashMap<>();
        ArrayList<int[]> l = new ArrayList<>();
        ArrayList<int[]> lc = new ArrayList<>();
        ArrayList<Float> cm = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("0.00");
        df.setMaximumFractionDigits(2);
        df.setRoundingMode(RoundingMode.DOWN);
        int n = 1;
        int q = 1;
        float m = 0;
        while (leia.hasNext()) {
            n = leia.nextInt();
            if (n == 0) {
                break;
            }
            int s1 = 0;
            int s2 = 0;
            for (int i = 0; i < n; i++) {
                int[] v = new int[2];
                v[0] = leia.nextInt();
                v[1] = leia.nextInt();
                s1 += v[1];
                s2 += v[0];
                v[1] = Math.floorDiv(v[1], v[0]);
                l.add(v);
            }
            lc = (ArrayList<int[]>) l.clone();
            h.put(q, lc);
            l.clear();
            m = (float) s1 / s2;
            cm.add(m);
            q++;
        }
        
        // ordenar os vetores de lugar na lista (de menor para maior valor de consumo)
        for (ArrayList<int[]> a : h.values()) {
            for (int j = 0; j < a.size()-1; j++) {
                for (int i = 0; i < a.size() - 1 - j; i++) {
                    if (a.get(i)[1] > a.get(i+1)[1]) {
                        int[] aux = a.get(i);
                        int[] aux2 = a.get(i+1);
                        a.set(i, aux2);
                        a.set(i+1, aux);
                    }
                }
            }
            // verificar se existe casas com mesma quantidade de consumo para juntar a quantidade de pessoas;
            for (int i = 0; i < a.size()-1; i++) {
                if (a.get(i)[1] == a.get(i+1)[1]) {
                    int[] v = {a.get(i)[0] + a.get(i+1)[0], a.get(i)[1]};
                    a.set(i, v);
                    a.remove(i+1);
                }
            }
        }
        
        int w = 0;
        for (Iterator<Integer> it = h.keySet().iterator(); it.hasNext();) {
            Integer k = it.next();
            System.out.printf("Cidade# %d:%n", k);
            ArrayList<int[]> a = h.get(k);
            for (int i = 0; i < a.size(); i++) {
                if (i == a.size()-1) {
                    System.out.printf("%d-%d%n", a.get(i)[0], a.get(i)[1]);
                } else {
                    System.out.printf("%d-%d ", a.get(i)[0], a.get(i)[1]);
                }
            }
            String s = df.format(cm.get(w)).replaceAll(",", ".");
            System.out.printf("Consumo medio: %s m3.%n", s);
            if (k != h.size()) {
                System.out.println("");
            }
            w++;
        }
    }

}