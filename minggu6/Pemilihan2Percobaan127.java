package minggu6;

import java.util.Scanner;
public class Pemilihan2Percobaan127 {
    public static void main(String[] args) {
    Scanner input27 = new Scanner (System.in);
        int tahun;

    System.out.println("Masukkan Tahun : ");
    tahun = input27.nextInt();

    if ((tahun % 4) == 0){
        if ((tahun % 400) == 0){
            System.out.println("Tahun Kabisat");
        }else if ((tahun % 100) != 0){
            System.out.println("Bukan Tahun Kabisat");
        }else {
            System.out.println("Bukan Tahun Kabisat");
         } 
    }else { 
        System.out.println("Bukan TAhun kabisat");
     
    input27.close();
    }
}
}
