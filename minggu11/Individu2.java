package minggu11;

import java.util.Scanner;

public class Individu2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan nilai N = "); 
        int N = sc.nextInt(); 
        int i = N;
        if (N > 5) {
            while (i >= 1) {
                int j = 1;
                while (j <= i) {
                    System.out.print("*");
                    j++;
                }
                System.out.println("");
                i--;
            }
        }

        sc.close();
    }
}
