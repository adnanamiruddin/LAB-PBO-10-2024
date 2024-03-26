import java.util.Scanner;

public class Tugas1No2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("Masukkan Judul Film :  \n> ");
        String film = input.nextLine();

        capitalFirstWord(film);

        input.close();
    }

    // Method
    public static void capitalFirstWord(String film) {
        String[] words = film.split(" ");

        for (String kata : words) {
            char firstChar = Character.toUpperCase(kata.charAt(0));
            String restWord = kata.substring(1).toLowerCase();

            System.out.print(firstChar + restWord + " ");
        }
    }
}
