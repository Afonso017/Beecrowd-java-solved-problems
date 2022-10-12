package problems;

public class SequenciaIJ3 {

    public static void main(String[] args) {
        int i = 1, j = 7;
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 3; b++) {
                System.out.print("I="+i+" ");
                System.out.print("J="+j);
                System.out.println("");
                j--;
            }
            i+=2;
            j+=5;
        }
    }

}