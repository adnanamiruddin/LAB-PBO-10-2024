package Java.H071231050;
import java.util.Scanner;

public class TP1_2_H071231050 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        String kalimat = input.nextLine();
        // TP1_2_H071231050 text = new TP1_2_H071231050();
        // text.ubahJudul(kalimat);
        ubahJudul(kalimat);
        input.close();
    }
    
    public static void ubahJudul(String judul){
        String kalimatKecil = judul.toLowerCase();
    
        String[] kata = kalimatKecil.split("\\s+");
        StringBuilder hasil = new StringBuilder();
    
    
        for (String huruf : kata){
            hasil.append(Character.toUpperCase(huruf.charAt(0)));
            hasil.append(huruf.substring(1)).append(" ");
        }
        System.out.println("Hasil: " + hasil.toString().trim());

    }
}
