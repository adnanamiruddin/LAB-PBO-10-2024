package Java.H071231050;
import java.util.Scanner;

public class TP1_5_H071231050 {
    public static void main(String[] args) {
    try {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka yang mau dicari : ");
        int angka = input.nextInt();

        for (int i = 0; i < array.length ; i++){
            for (int j = 0; j < array[i].length; j++){

                if (array[i][j] == angka){
                    // System.out.println("Found " + angka + " at " + "[" + i + "]" + "[" + j + "]");
                    String output = String.format("Found %d at [%d][%d]", angka, i, j);
                    System.out.println(output);
                    // System.out.printf("Found %d at [%d][%d]", angka, i, j);
                    break;
                }
            }
        }
    }catch (Exception e){
        System.out.println("Masukkan Angka !");
        }
    }
}
