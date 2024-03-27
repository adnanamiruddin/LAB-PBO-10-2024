package TugasPraktikum1;
import java.util.*;

public class Tugas1No2 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
            
        System.out.print("Masukkan Judul Film : ");
        String kalimat = inputan.nextLine();
        inputan.close();
            
        String[] Arr_Kata = kalimat.split(" ");
            
        for (int i = 0; i < Arr_Kata.length; i++) {
            Arr_Kata[i] = kapHurufPertama(Arr_Kata[i]);
        }
            
        String output = String.join(" ", Arr_Kata);
        System.out.println("Hasil: " + output);
    }
    
    public static String kapHurufPertama(String kata) {
        if (kata == null || kata.isEmpty()) {
            return kata;
        }
        return Character.toUpperCase(kata.charAt(0)) + kata.substring(1).toLowerCase();
    }
}