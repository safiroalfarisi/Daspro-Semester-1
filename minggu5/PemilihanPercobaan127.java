package minggu5;

import java.util.Scanner;
public class PemilihanPercobaan127 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input00.nextInt();
        String hasil;
        hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println(angka + " adalah " + hasil);
        input00.close();
    }
}
