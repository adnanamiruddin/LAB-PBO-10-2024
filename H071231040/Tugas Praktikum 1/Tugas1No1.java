import java.util.Scanner;

public class Tugas1No1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        try {
            int n = input.nextInt();
    
            int banyakBulat = 0;
            int banyakDecimal = 0;
    
            for (int i = 0; i < n; i++) {
                try {
                    double bilangan = input.nextDouble();

                    if (bilangan % 1 == 0) {
                        banyakBulat++;
                    }
                    else {
                        banyakDecimal++;
                    }

                } catch (Exception e) {
                    System.out.println("Inputan Harus Angka");
                    break;
                }
            }

            System.out.println("\n" + banyakBulat + " Bilangan Bulat\n" + banyakDecimal + " Bilangan Desimal");
            
            input.close();

        } catch (Exception e) {
            System.out.println("Inputan Harus Angka");
        }
    }
}

