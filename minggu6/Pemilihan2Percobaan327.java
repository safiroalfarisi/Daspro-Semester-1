package minggu6;

import java.util.Scanner;
public class Pemilihan2Percobaan327 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner (System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.println("Masukkan Kategori :");
        kategori =input27.nextLine();
        System.out.println("Masukkan besarnya penghasilan :");
        penghasilan = input27.nextInt();

        if (kategori.equalsIgnoreCase("Pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak =0.2;
            gajiBersih = (int) (penghasilan -(pajak * penghasilan));
            System.out.println("Penghasilan bersih : " + gajiBersih);
        } else if ( kategori.equals("Pebisnis")){
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan -(pajak * penghasilan));
            System.out.println("Penghasilan bersih : " + gajiBersih);
        } else 
            System.out.println("Masukan kategori salah");
        
        input27.close();
    }
}
