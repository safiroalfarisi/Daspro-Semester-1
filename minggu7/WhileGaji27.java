package minggu7;

import java.util.Scanner;; 
public class WhileGaji27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int jmlKaryawan, jmlJamLembur;
        double gajiLembur =0, totalGajiLembur=0;
        String jabatan;

        System.out.println("Masukkan jumlah karyawan :");
        jmlKaryawan = scan.nextInt();

        int i=0;
        while (i < jmlKaryawan) {
            System.out.println("Pilihan jabatan = Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + i);
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jmlJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            }else if (jabatan.equalsIgnoreCase("Manajer")) {
                gajiLembur = jmlJamLembur * 100000;
            }else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jmlJamLembur * 750000;
                totalGajiLembur += gajiLembur;
            }else {
                System.out.println("Jabatan invalid");
                i--;
            }
            
        }
        System.out.println("Total gaji lembur : " + totalGajiLembur);
        scan.close();
    }
} 
