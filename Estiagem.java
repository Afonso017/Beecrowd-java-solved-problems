package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Estiagem {
    
    public static void Rearrange(HashMap<Integer, ArrayList> a) {
        for (Map.Entry<Integer, ArrayList> entry : a.entrySet()) {
            Integer key = entry.getKey();
            ArrayList value = entry.getValue();
            for (int i = 0; i < value.size(); i++) {
                int get = (Integer) value.get(i);
                int get2 = (Integer) value.get(i+2);
                if (get > get2) {
                    // processo de ordenação da lista
                }
            }
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> casa = new ArrayList<>(), cop = new ArrayList<>();
        HashMap<Integer, ArrayList> cidade = new HashMap<>();
        int n = leia.nextInt();
        int c = 1;
        while (n != 0) {
            for (int i = 0; i < n; i++) {
                int x = leia.nextInt();
                int y = leia.nextInt();
                casa.add(x);
                casa.add(y);
            }
            cop = (ArrayList<Integer>) casa.clone();
            cidade.put(c, cop);
            casa.clear();
            n = leia.nextInt();
            c++;
        }
        System.out.println("Values:");
        for (Map.Entry<Integer, ArrayList> entry : cidade.entrySet()) {
            Integer key = entry.getKey();
            ArrayList value = entry.getValue();
            System.out.printf("Cidade# %d:\n", key);
            System.out.println(value);
        }
    }
    
}