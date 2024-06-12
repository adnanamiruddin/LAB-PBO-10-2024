package TugasPraktikum5.Tugas5No2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TokoElektronik Andi = new TokoElektronik();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan beberapa produk ke dalam stok toko
        Andi.tambahProduk(new Smartphone("Samsung", "SM123", 5000000, 6, "128 GB"));
        Andi.tambahProduk(new Laptop("ROG", "506LHB", 8000000, 8, "i7 12400f"));
        Andi.tambahProduk(new Kamera("Canon", "CN321", 3000000, 24, "Mirror"));

        // Menu utama
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan jenis produk (Smartphone/Laptop/Kamera): ");
                    String jenisProduk = scanner.nextLine();
                    System.out.print("Masukkan Brand    : ");
                    String brand = scanner.nextLine();
                    System.out.print("Masukkan Nomor Seri   : ");
                    String seriesNumber = scanner.nextLine();
                    System.out.print("Masukkan Harga    : ");
                    int price = Integer.parseInt(scanner.nextLine());

                    if (jenisProduk.equalsIgnoreCase("Smartphone")) {

                        System.out.print("Masukkan Ukuran Layar : ");
                        int ukuranLayar = scanner.nextInt();

                        System.out.print("Masukkan Kapasitas Penyimpanan : ");
                        String kapasitasPenyimpanan = scanner.nextLine();

                        Andi.tambahProduk(new Smartphone(brand, seriesNumber, price, ukuranLayar, kapasitasPenyimpanan));

                    } else if (jenisProduk.equalsIgnoreCase("Laptop")) {

                        System.out.print("Masukkan Ukuran RAM : ");
                        int ramSize = scanner.nextInt();

                        System.out.print("Masukkan Tipe Prosessor : ");
                        String processorType = scanner.nextLine();

                        Andi.tambahProduk(new Laptop(brand, seriesNumber, price, ramSize, processorType));
                        
                    } else if (jenisProduk.equalsIgnoreCase("Kamera")) {

                        System.out.print("Masukkan Resolution Kamera : ");
                        int resolution = scanner.nextInt();

                        System.out.println("Masukkan Tipe Lensa : ");
                        String lensType = scanner.nextLine();
                        Andi.tambahProduk(new Kamera(brand, seriesNumber, price, resolution, lensType));
                    } else {
                        System.out.println("Jenis Produk Tidak Valid !!!");
                    }
                    System.out.println("Produk Berhasil Ditambahkan !!!");
                    break;

                case "2":
                    System.out.println("Daftar Semua Produk : ");
                    Andi.tampilkanSemuaProduk();
                    break;

                case "3":
                    System.out.println("=============================================");
                    System.out.print("Masukkan Nomor Seri Produk yang Ingin Dibeli : ");
                    String seriesNumberBeli = scanner.nextLine();
                    Andi.beliProduk(seriesNumberBeli);
                    break;

                case "4":
                    System.out.println("Terima Kasih !!!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan Tidak Valid. Silahkan Pilih Menu yang Benar !!!");
            }
        }
    }
}
