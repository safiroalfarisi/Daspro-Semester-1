package minggu4;

import java.util.Scanner;
/**
 * Harga_Bayar_27
 */
public class Harga_Bayar_27 {

    public static void main(String[] args) {
    Scanner input =new Scanner(System.in); 

    int harga, jumlah;
    double dis=0.1, total, bayar, jmlDis;
    
    System.out.println("Masukkan harga barang dibeli : ");
    harga = input.nextInt();

    System.out.println("Masukkan jumlah barang dibeli : ");
    jumlah=input.nextInt();

    total=harga*jumlah;
    jmlDis=total*dis;
    bayar=total-jmlDis;

    System.out.println("Diskon yang anda dapatkan adalah : " + jmlDis);
    System.out.println("Jumlah yang harus dibayar adalah : " + bayar);

    }
}