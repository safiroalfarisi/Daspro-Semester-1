package minggu6;

import java.util.Scanner;
public class SegitigaSudut27 {
    public static void main(String[] args) {
        
    Scanner input27 = new Scanner (System.in);
    
    float sudut1, sudut2, sudut3, totalSudut;

    System.out.println("Masukkan besar sudut 1 : ");
    sudut1=input27.nextFloat();
    System.out.println("Masukkan besar sudut 2 : ");
    sudut2=input27.nextFloat();
    System.out.println("Masukkan besar sudut 3 : ");
    sudut3=input27.nextFloat();

    totalSudut= sudut1+sudut2+sudut3;

    if (totalSudut == 180){
        if ((sudut1==60) && (sudut2 == 60) && (sudut3 == 60))
            System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else if ((sudut1 == 90) || (sudut2 ==90) || (sudut3 ==90)){
                if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut1 == sudut3))
                System.out.println(" Segitiga tersebut adalah segitiga siku siku sama kaki");
                else 
                System.out.println("Segitiga tersebut adalah segitiga siku siku");
            }
                else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut1 == sudut3)) {
                    System.out.println("Segitiga tersebut adalah segitiga sama kaki");
                }
                    else if ((sudut1 != 90) && (sudut2 !=90) && (sudut3 != 90)){
                        System.out.println(" Segitiga tersebut adalah segitiga sembarang");
                    
        }else {
            System.out.println("Bukan segitiga");
        }
    }

    input27.close();


    }
}
