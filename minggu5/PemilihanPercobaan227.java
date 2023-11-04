package minggu5;

import java.util.Scanner;

public class PemilihanPercobaan227 {

    public static void main (String[] args){
        String nilaiHuruf = " " ;
        Scanner input00 = new Scanner (System.in);
        System.out.println("Nilai uas   : ");
        float uas = input00.nextFloat();
        System.out.println("Nilai uts   : ");
        float uts = input00.nextFloat();
        System.out.println("Nilai kuis  : ");
        float kuis = input00.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input00.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.10F) + (tugas * 0.2F);
        
        if (total > 80 && total <= 100){
            nilaiHuruf = "A";
        }if (total > 73 && total <= 80){
            nilaiHuruf = "B+";
        }if(total > 65 && total <= 73){
            nilaiHuruf = "B";
        }if(total > 60 && total <= 65 ){
            nilaiHuruf = "C+";
        }if(total > 50 && total <= 60){
            nilaiHuruf = "C";
        }if(total > 39 && total <= 50 ){
            nilaiHuruf = "D";
        }if(total <= 39){
            nilaiHuruf = "E";
        }
        
        System.out.println("nilai Huruf yang anda dapatkan: " + nilaiHuruf);
        input00.close();
    }   
}