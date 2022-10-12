package problems;

import java.util.Scanner;

public class Mandioca {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int cu = leia.nextInt() * 300;
        int boi = leia.nextInt() * 1500;
        int bot = leia.nextInt() * 600;
        int map = leia.nextInt() * 1000;
        int iar = leia.nextInt() * 150;
        int total = cu + boi + bot + map + iar + 225;
        System.out.println(total);
    }

}