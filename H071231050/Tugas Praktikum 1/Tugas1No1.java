package Java.H071231050;
import java.util.Scanner;

public class TP1_1_H071231050 {
    public static void main(String[] args) {  
    try{
        Scanner input = new Scanner(System.in);
        int bilanganBulat = 0, bilanganDesimal = 0 ;
        int jumlah = input.nextInt();
        
        for (int i=0; i < jumlah; i++ ){
                try{
                    int bilangan = input.nextInt();
                    bilanganBulat++ ;
                } catch (Exception e){
                    double bilangan = input.nextDouble();
                    bilanganDesimal++ ;
                }   
            }      
            input.close();
            System.out.println(bilanganBulat + " Bilangan Bulat");
            System.out.println(bilanganDesimal + " Bilangan Desimal"); 
            
    } catch (Exception e){  
        System.out.println("Masukkan Angka !");  
    }
    }   
}