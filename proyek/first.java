package proyek;

import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahBarang;
        System.out.println("Masukkan jumlah barang");
        jumlahBarang = sc.nextInt();
        int jumlahBarangDiPilih;
        System.out.println("Masukkan Jumlah Barang dipilih");
        jumlahBarangDiPilih = sc.nextInt();
        int hargaBarang;
        System.out.println("Masukkan harga brang");
        hargaBarang = sc.nextInt();
        int biayaBelanja;
        biayaBelanja = jumlahBarangDiPilih*hargaBarang;
        System.out.println("Total Belanja" + biayaBelanja);
        int sisaBarang;
        sisaBarang = jumlahBarang-jumlahBarangDiPilih;
        System.out.println("Sisa Stok barang ini:" + sisaBarang);
        int pendapatan;
        int jumlahBeliBarang;

    }
}
