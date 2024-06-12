package TugasPraktikum7.main;

import java.util.Scanner;

import TugasPraktikum7.kelas.Karyawan;
import TugasPraktikum7.kelas.Keluarga;
import TugasPraktikum7.kelas.Pendidikan;
import TugasPraktikum7.kelas.Pengalaman;
import TugasPraktikum7.kelas.Projek;
import TugasPraktikum7.sound.Audio;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    public static ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        tampilanUtama();
    }
    public static void tampilanUtama(){
        char pilihan;
        do {
            System.out.println("===========================================================================");
            System.out.println("Data Karyawan:");
            System.out.println("a. Tambahkan Data Karyawan");
            System.out.println("b. Tampilkan Detail Data Karyawan");
            System.out.println("c. Keluar");

            System.out.print("Pilih opsi (a-c): ");
            pilihan = input.next().charAt(0);
            System.out.println("===========================================================================");

            switch (pilihan) {
                case 'a':
                    tambahDataKaryawan();
                    break;
                case 'b':
                    tampilkanDataKaryawan();
                    break;
                case 'c':
                    System.out.println("Terima kasih !!!");
                    break;
                default:
                    System.out.println("OPSI TIDAK VALID !!!");
            }
        } while (pilihan != 'c');
    }

    public static void tambahDataKaryawan(){
        try{
            System.out.println("TAMBAH DATA KARYAWAN");
            System.out.println("===========================================================================");
            System.out.print("Masukkan Nama : ");
            input.nextLine();
            String nama = input.nextLine();
            if (!nama.matches("[a-zA-Z\\s]*")) {
                System.out.println("===========================================================================");
                System.out.println("INPUT HARUS BERUPA STRING !!!");
                return;
            }
            
            int umur;
            while (true) {
                System.out.print("Masukkan Umur : ");
                String umurInput = input.nextLine();

                try {
                    umur = Integer.parseInt(umurInput); // Try parsing to integer
                    break; // Exit loop if parsing is successful
                } catch (NumberFormatException e) {
                    System.out.println("===========================================================================");
                    System.out.println("INPUT UMUR HARUS BERUPA ANGKA !!!");
                    System.out.println("===========================================================================");
                }
            }

            System.out.print("Masukkan Jabatan : ");
            String jabatan = input.nextLine();
            if (!jabatan.matches("[a-zA-Z\\s]*")) {
                System.out.println("===========================================================================");
                System.out.println("INPUT HARUS BERUPA STRING !!!");
                return;
            }

            double gaji;
            while (true) {
                System.out.print("Masukkan Gaji: ");
                String gajiInput = input.nextLine();

                try {
                    gaji = Double.parseDouble(gajiInput); // Try parsing to double
                    break; // Exit loop if parsing is successful
                } catch (NumberFormatException e) {
                    System.out.println("===========================================================================");
                    System.out.println("INPUT GAJI HARUS BERUPA ANGKA !!!");
                    System.out.println("===========================================================================");
                }   
        }
        
            System.out.println("===========================================================================");
            System.out.print("Status Keluarga (Anak Pertama/Anak Tengah/Anak Terakhir) : ");
            String anak = input.nextLine();
            if (!anak.matches("[a-zA-Z\\s]*")) {
                System.out.println("===========================================================================");
                System.out.println("INPUT HARUS BERUPA STRING !!!");
                return;
            }
            Keluarga keluarga = new Keluarga(anak);
            keluarga.prosesKehidupan();
            keluarga.status();

            System.out.println("===========================================================================");
            System.out.println("PENGALAMAN SEBELUMNYA");
            System.out.println("1. Freelancer");
            System.out.println("2. Magang");
            System.out.println("3. Pekerja tetap");
            System.out.println("4. Tidak ada"); 
            System.out.println("===========================================================================");
            System.out.print("Input (1/2/3/4) : ");
            int inPengalaman = input.nextInt();
            input.nextLine();
            String jenisPekerjaan;
            switch (inPengalaman) {
                case 1:
                    jenisPekerjaan = "Menjadi Freelancer";        
                    break;
                case 2: 
                    jenisPekerjaan = "Magang";        
                break;
                case 3:
                    jenisPekerjaan = "Menjadi Pekerja Tetap";        
                break;                    
                default:
                    jenisPekerjaan = "Tidak Ada";        
                break;
            }
            Pengalaman pengalaman = new Pengalaman(jenisPekerjaan);
            pengalaman.prosesKehidupan();
            pengalaman.pengalamanKaryawan(jenisPekerjaan, inPengalaman);

            System.out.println("===========================================================================");
            System.out.print("Pendidikan Terakhir (SD/SMP/SMA/SMK/S1/S2/S3) : ");
            String inPendidikan = input.nextLine();
            
            if (!inPendidikan.matches("[A-Z0-9\\s]*")) {
                System.out.println("===========================================================================");
                System.out.println("INPUT HARUS BERUPA STRING !!!");
                return;
            }

            Pendidikan pendidikan = new Pendidikan(inPendidikan);
            pendidikan.prosesKehidupan();
            pendidikan.pendidikanKaryawan();
            System.out.println("===========================================================================");

            System.out.println("PROJEK PENETRATION TESTING (1/2/3/4): ");
            System.out.println("1. 0 <= 4");
            System.out.println("2. 5 <= 7");
            System.out.println("3. 8 <= 16");
            System.out.println("4. Lebih dari 16");
            System.out.println("===========================================================================");
            System.out.print("Input (1/2/3/4) : ");
            int projek = input.nextInt();
            System.out.println("===========================================================================");


            Karyawan karyawan = new Karyawan(nama, umur, jabatan, gaji);
            Projek projek1 = new Projek(projek);

            
            if (inPendidikan.equalsIgnoreCase("SD") || inPendidikan.equalsIgnoreCase("SMP") || projek == 1 || umur < 18) {
                System.out.println("===========================================================================");
                System.out.println("SAYANG SEKALI... KARYAWAN TIDAK MEMENUHI SYARAT !!!");
                System.out.println("===========================================================================");
                Audio.playAudioLose("TugasPraktikum7/sound/ntbruh.wav");

            } else {
                daftarKaryawan.add(karyawan);
                projek1.jumlahProjek();
                pendidikan.pendidikanKaryawan();
                System.out.println("===========================================================================");
                System.out.println("SELAMAT... KARYAWAN DITERIMA !!!");
                System.out.println("===========================================================================");
                Audio.playAudio("TugasPraktikum7/sound/finally.wav");
            }

        } catch (InputMismatchException e) {
            System.out.println("INPUT HARUS BERUPA INTEGER !!!");
            input.nextLine(); }
        }
    

    public static void tampilkanDataKaryawan() {
        if (daftarKaryawan.isEmpty()) {
            System.out.println("DATA KARYAWAN TIDAK DITEMUKAN !!!");
            return;
        }

        for (Karyawan karyawan : daftarKaryawan) {
            System.out.println(karyawan.getName());
            karyawan.display();
        }
    } 
} 

