package TugasPraktikum5.Tugas5No1;

import java.util.Scanner;

public class Main {
    // Fungsi untuk menampilkan menu
    static void menu() {
        System.out.println("------------------------------------------------------");
        System.out.println("   ===== BANGUN RUANG =====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println("   ===== BANGUN DATAR =====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        System.out.println("------------------------------------------------------");
    }

    // Fungsi utama
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu();
        System.out.print("Pilihan : ");
        int pilihan = scanner.nextInt();
        System.out.println("------------------------------------------------------");

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Panjang Sisi Kubus : ");
                double sisiKubus = scanner.nextDouble();

                Kubus kubus = new Kubus(sisiKubus);

                System.out.println("Volume Kubus : " + kubus.hitungVolume());
                System.out.println("Luas Permukaan Kubus : " + kubus.hitungLuasPermukaan());
                break;
                
            case 2:
                System.out.print("Masukkan Panjang Balok : ");
                double panjangBalok = scanner.nextDouble();

                System.out.print("Masukkan Lebar Balok : ");
                double lebarBalok = scanner.nextDouble();

                System.out.print("Masukkan Tinggi Balok : ");
                double tinggiBalok = scanner.nextDouble();

                Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);

                System.out.println("Volume Balok : " + balok.hitungVolume());
                System.out.println("Luas Permukaan Balok : " + balok.hitungLuasPermukaan());
                break;

            case 3:
                System.out.print("Masukkan Jari-Jari Bola : ");
                double jariJariBola = scanner.nextDouble();
                
                Bola bola = new Bola(jariJariBola);

                System.out.println("Volume Bola : " + bola.hitungVolume());
                System.out.println("Luas Permukaan Bola : " + bola.hitungLuasPermukaan());
                break;

            case 4:
                System.out.print("Masukkan Jari-Jari Tabung : ");
                double jariJariTabung = scanner.nextDouble();

                System.out.print("Masukkan Tinggi Tabung : ");
                double tinggiTabung = scanner.nextDouble();

                Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);

                System.out.println("Volume Tabung : " + tabung.hitungVolume());
                System.out.println("Luas Permukaan Tabung : " + tabung.hitungLuasPermukaan());
                break;

            case 5:
                System.out.print("Masukkan Sisi Persegi : ");
                double sisi = scanner.nextDouble();

                Persegi persegi = new Persegi(sisi);
                System.out.println("Luas Persegi : " + persegi.hitungLuas());
                System.out.println("Keliling Persegi : " + persegi.hitungKeliling());
                break;

            case 6: 
                System.out.print("Masukkan Panjang Persegi : ");
                double panjang = scanner.nextDouble();

                System.out.print("Masukkan Lebar Persegi : ");
                double lebar = scanner.nextDouble();
                
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

                System.out.println("Luas Persegi Panjang : " + persegiPanjang.hitungLuas());
                System.out.println("Keliling Persegi Panjang : " + persegiPanjang.hitungKeliling());
                break;

            case 7:
                System.out.print("Masukkan Jari-Jari Lingkaran : ");
                double jariJari = scanner.nextDouble();

                Lingkaran lingkaran = new Lingkaran(jariJari);

                System.out.println("Luas Lingkaran : " + lingkaran.hitungLuas());
                System.out.println("Keliling Lingkaran : " + lingkaran.hitungKeliling());
                break;

            case 8:
                System.out.print("Masukkan Panjang Sisi 1 Trapesium : ");
                double sisiSejajar1 = scanner.nextDouble();
        
                System.out.print("Masukkan Panjang Sisi 2 Trapesium : ");
                double sisiSejajar2 = scanner.nextDouble();
        
                System.out.print("Masukkan Panjang Sisi 3 Trapesium : ");
                double sisiTidakSejajar1 = scanner.nextDouble();
                
                System.out.print("Masukkan Panjang Sisi 4 Trapesium : ");
                double sisiTidakSejajar2 = scanner.nextDouble();

                System.out.print("Masukkan Tinggi Trapesium: ");
                double tinggi = scanner.nextDouble();
                scanner.close();

                Trapesium trapesium = new Trapesium(sisiSejajar1, sisiSejajar2, sisiTidakSejajar1, sisiTidakSejajar2, tinggi);
        
                System.out.println("Luas Trapesium : " + trapesium.hitungLuas());
                System.out.println("Keliling Trapesium : " + trapesium.hitungKeliling());
                break;
                
            default:
                System.out.println("Pilihan Tidak Valid !!!");

        }     
    }
}
 