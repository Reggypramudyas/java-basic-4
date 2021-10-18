// Reggy Pramudya S
// Grup 1 Siang

/// Import utility scanner java
import java.util.Scanner;
public class JavaBasic4 {

// Method
    public static void main (String[] args){
        System.out.println ("Masukan Nilai : ");
        Scanner scanner = new Scanner(System.in);
        int nilai = scanner.nextInt();

        regMethod (nilai);
    }

    public static void regMethod(int nilai) {
        System.out.print("Hasil : ");
        
        if (nilai >100) {
            System.out.println (" Invalid Number");   
        } else if (nilai >=0 && nilai<= 20){
            System.out.println (" Nilai Anda = E");
            System.out.println (" Tidak Lulus");
        
        } else if (nilai>= 21 && nilai <= 40) {
            System.out.println ( "Nilai Anda = D");
            System.out.println ( " Lulus Bersyarat");

        } else if (nilai>= 41 && nilai <= 60) {
            System.out.println ("Nilai Anda = C ");
            System.out.println (" Cukup ");
        } else if (nilai>= 61 && nilai <= 80) {
            System.out.println (" Nilai Anda = B ");
            System.out.println (" Baik ");
        } else if (nilai >=81 && nilai <=100){
            System.out.println ("Nilai Anda = A");
            System.out.println (" Sangat Baik") ;
        } else {
            System.out.println("nilai salah");
        }
    }

}