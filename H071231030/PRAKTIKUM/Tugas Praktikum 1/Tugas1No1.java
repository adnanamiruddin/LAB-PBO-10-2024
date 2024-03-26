import java.util.Scanner;

public class Tugas1No1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int barisSatu;
        double barisKedua;
        int bilBulat=0;
        int bilDesimal=0;
        
        while (true){
            if(scanner.hasNextInt()){ //jika integer masuk
                barisSatu=scanner.nextInt();
                if (barisSatu>0){
                    break;
                }else{
                    System.out.println("Masukkan bilangan bulat positiff!");
                }
            }else{  //jika bkn integer masuk
                scanner.next();
                System.out.println("Masukkan bilangan bulat positif!");
            }
        }

        for(int i=0;i<barisSatu;i++){
            try {
                barisKedua=scanner.nextDouble();
                if(barisKedua%1==0){
                    bilBulat++;
                }else{
                    bilDesimal++;
                }
            } catch (Exception e) {
                System.out.println("Masukkan bilangan!");
                scanner.next(); //kalau nextLine terulang dari awal jika baris kedua ada angka dan bukan angka
                i--;
            }
        }
        System.out.println(bilBulat+" Bilangan Bulat");
        System.out.println(bilDesimal+" Bilangan Desimal");
        scanner.close();
    }
}