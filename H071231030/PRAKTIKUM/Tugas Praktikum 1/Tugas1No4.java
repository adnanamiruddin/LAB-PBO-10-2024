import java.util.Scanner;

public class Tugas1No4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan radius lingkaran: ");

        try {
            double radius = scanner.nextDouble();
            double hasil = Math.PI * radius * radius; //3,14 x r2
            System.out.printf("Luas lingkaran dengan radius %.2f adalah: %.2f\n", radius, hasil);
        } catch (Exception e) {
            System.out.println("Input yang Anda masukkan bukan angka.");
        } finally {
            scanner.close();
        }
    }
}