package minggu7;

import java.util.Scanner;
public class WhileKelipatan27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int kelipatan, jumlah=0, counter=0;

        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i<=50) {
            if (i % kelipatan == 0) {
                jumlah+= i;
                counter++;
            }
            i++;
        }

        System.out.printf("Banyaknya bilangan %d dari 1-50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan %d dari 1-50 adalah %d\n", kelipatan, jumlah);
        
        scan.close();
    }
}
