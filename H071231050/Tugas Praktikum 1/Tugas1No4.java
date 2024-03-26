package Java.H071231050;
import java.util.Scanner;

public class TP1_4_H071231050 {
    public static void main(String[] args) {
    try {
        Scanner input = new Scanner (System.in);
        double jari2 = input.nextDouble();
        double pi = 3.14;

        double luas = Math.PI * jari2 * jari2 ;
        
        System.out.printf("%.2f",luas);
    } catch (Exception e){
        System.out.println("Input Angka !");
        }
    }
}
