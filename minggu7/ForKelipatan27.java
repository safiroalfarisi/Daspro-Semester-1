package minggu7;

import java.util.Scanner;
public class ForKelipatan27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int kelipatan, jumlah=0, counter=0;
        double rataRata;

        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }
        rataRata = (double)jumlah/counter;

        System.out.printf("Banyaknya bilangan %d dari 1-50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan %d dari 1-50 adalah %d\n", kelipatan, jumlah);
        System.out.print("Rata - Rata : " + rataRata);

        scan.close();;
    }
}
