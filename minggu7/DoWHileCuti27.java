package minggu7;

import java.util.Scanner;
public class DoWHileCuti27 {
    public static void main(String[] args) {
            Scanner scan = new Scanner (System.in);
            int jatahCuti, jmlHari;
            String konfirmasi;

            System.out.println("Jatah cuti : ");
            jatahCuti = scan.nextInt();

            do{
                System.out.print("Apakah anda ingin mengambil cuti (y/t)?");
                konfirmasi = scan.next();

                if (konfirmasi.equalsIgnoreCase("y")) {
                    System.out.println("Jumlah hari : ");
                    jmlHari = scan.nextInt();

                    if (jmlHari<=jatahCuti) {
                        jatahCuti-=jmlHari;
                        System.out.println("Sisa jatah cuti : " + jatahCuti);
                    }else {
                        System.out.println("Jatah cuti anda tidak mencukupi");
                    }
                if (konfirmasi.equalsIgnoreCase("t")) {
                    break;
                }
                }
            } while (jatahCuti>0);

            scan.close();
    }
}