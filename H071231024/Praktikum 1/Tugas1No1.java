package TugasPraktikum1;
import java.util.*;

public class Tugas1No1 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Bilangan : ");
        int n = inputan.nextInt();
        inputan.nextLine();

        int Bil_Bulat = 0;
        int Bil_Desimal = 0;

        System.out.print("Masukkan " + n + " Bilangan : ");
        String bilangan = inputan.nextLine();
        String[] angka = bilangan.split(" ");

        inputan.close();

        for (String angkaBaru : angka) {
            try { 
                double ang = Double.parseDouble(angkaBaru);
                if (ang == (int) ang) {
                    Bil_Bulat++;   
                } else {
                    Bil_Desimal++;
                }
            } catch (Exception e) {
                System.out.println("Input Harus Berupa Angka. Coba Lagi!");
                return;
            }

        }
        
        System.out.println("\nTerdapat " + Bil_Bulat + " Bilangan Bulat" );
        System.out.println("Terdapat " + Bil_Desimal + " Bilangan Desimal" );
    }
    
}
