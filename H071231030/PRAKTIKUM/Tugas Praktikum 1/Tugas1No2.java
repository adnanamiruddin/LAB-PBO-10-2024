import java.util.Scanner;

public class Tugas1No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul Film : ");
        String kalimat = input.nextLine();
        String hasil = tittleConvert(kalimat);
        System.out.println(hasil);
        input.close();
    }
    public static String tittleConvert(String awal){
        String[] kata = awal.split(" ");
        String akhir = "";
        for (String s : kata){
            String kapital = s.substring(0, 1).toUpperCase();
            String sisanya = s.substring(1).toLowerCase();
            akhir += kapital + sisanya +" ";
        }
        return akhir;
    }
}