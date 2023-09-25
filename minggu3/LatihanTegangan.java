import java.util.Scanner;
public class LatihanTegangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double R1,R2,R3,R4,V,I,Rtotal,Rp;

        System.out.println("Masukkan nilai R1 : ");
        R1 = sc.nextDouble();

        System.out.println("Masukkan nilai R2 :");
        R2 = sc.nextDouble();

        System.out.println("Masukkan nilai R3 : ");
        R3 = sc.nextDouble();
        
        System.out.println("Masukkan nilai R4 : ");
        R4 = sc.nextDouble();

        System.out.println("Masukkan nilai I : ");
        I = sc.nextDouble();

        Rp = 1 / (((1/R1) + (1/R2) + (1/R3)));
        System.out.println("\nRp\t= " + Rp);
        Rtotal = R4 + Rp;
        System.out.println("Rtotal\t= " + Rtotal);
        V = I * Rtotal;
        System.out.println("V\t= " + V);


    }
}
