package minggu4;

import java.util.Scanner;
public class gaji27 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji=40000, potGaji=25000;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda : ");
        jmlMasuk=input.nextInt();

        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja : ");
        JmlTdkMasuk=input.nextInt();

        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);

        System.out.println("Gaji yang anda terima adalah : " + TotGaji);
    }
}
