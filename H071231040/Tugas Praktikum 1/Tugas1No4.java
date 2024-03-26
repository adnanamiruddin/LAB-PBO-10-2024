import java.util.Scanner;

public class Tugas1No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        while (true) {
            try {
                System.out.print("r = ");
                double r = input.nextDouble();
                final double pi = 3.14159d;
                    
                double luas = pi * r * r;
                    
                String hasil = String.format("Hasil : %.2f", luas);
                System.out.println(hasil);

                break;    
            } catch (Exception e) {
                System.out.println("Inputan Harus Angka");
                input.nextLine();
            }
        }
        
        input.close();
    }
}
