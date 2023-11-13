package minggu10;

import java.util.Scanner;
public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String[][] penonton = new String[4][2];

        penonton [0][0] = "Amin";
        penonton [0][1] = "Bena";
        penonton [1][1] = "Dela";
        penonton [2][1] = "Farhan";
        penonton [3][0] = "Gisel";
        

        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                penonton[i][j]= "***";
            }
        }

        System.out.println("Menu ");
        System.out.println("1: Input data penonton  ");
        System.out.println("2: Tampilkan daftar penonton  ");
        System.out.println("3: Exit ");
        System.out.print("Masukan pilihan menu anda : ");
        menu = sc.nextInt();

        if (menu == 1) {
            while (true) {
            System.out.print("Masukan nama :");
            nama = sc.next();

            System.out.print("Masukan baris :");
            baris = sc.nextInt();
            System.out.print("Masukan kolom :");
            kolom = sc.nextInt();
            sc.nextLine();

            
            if (penonton[baris-1][kolom-1] != "***") {
                System.out.println("!!!Kursi yang anda pilih tidak Tersedia, Silahkan pilih kursi kembali!!!");
                continue;
            }
            penonton[baris-1][kolom-1] = nama;
            System.out.print("Input penonton lainnya (y/n) : ");
            next = sc.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    } else if (menu == 2) {
        System.out.println("Daftar penonton :");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke- " + (i+1) + ": " + String.join(", ", penonton[i]));
            
        }
    } else if (menu == 3){
        System.out.println("Terimakasih");
    }

        sc.close();
    }
}
