package Tugas_LAB_PBO.TP_7;

import java.util.Scanner;
import java.util.ArrayList;
import Tugas_LAB_PBO.TP_7.Task.*;
import Tugas_LAB_PBO.TP_7.Utils.*;

public class KaryawanApp {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

    // Method menampilkan Menu Utama
    private static void tampilkanMenu() {
        Start.Line("=", 50);
        System.out.println(" ".repeat(9) + "Aplikasi Manajemen Data Karyawan" + " ".repeat(9));
        Start.Line("=", 50);
        
        System.out.println("Data Karyawan:");
        System.out.println("a. Tambah Data Karyawan");
        System.out.println("b. Tampilkan Detail Karyawan");
        System.out.println("c. Tampilkan Diagram");
        System.out.println("d. Keluar");
        Start.Line("=", 50);
    }

    private static void gajiSebelum(Karyawan karyawan) {
        double inGaji = Input.inputAngkaUser(sc, "Gaji Sebelumnya : ");
        karyawan.setGaji((inGaji + 1000000));
    }

    private static void checkKelulusan(Karyawan karyawan) {
        boolean kelulusan = false;
        if (karyawan.pendidikan.getTingkatPendidikan() > 2 && karyawan.projek.getBanyakProjek() > 4 && karyawan.getUmur() >= 18
            && karyawan.pengalaman.getJenisPekerjaan().matches("Freelancer|Magang|Pekerja Tetap")) {
            kelulusan = true;
        } 

        if (kelulusan) {
            Start.Line("=", 50);
            System.out.println(" ".repeat(14) + "SELAMAT ANDA DITERIMA" + " ".repeat(15));
            Start.Line("=", 50);
            Audio.playAudio("Tugas_LAB_PBO\\TP_7\\Audio\\Congratulation.wav");
            daftarKaryawan.add(karyawan);
        } else {
            Start.Line("=", 50);
            System.out.println(" ".repeat(10) + "KARYAWAN TIDAK MEMENUHI SYARAT" + " ".repeat(10));
            Start.Line("=", 50);
            Audio.playAudio("Tugas_LAB_PBO\\TP_7\\Audio\\FailedSound.wav");
        }
    }

    // Method menjalankan opsi Tambah Data Karyawan
    private static void runTambahDataKaryawan() {
        Start.Line("-", 50);
        System.out.println(" ".repeat(15) + "Tambah Data Karyawan" + " ".repeat(15));
        Start.Line("-", 50);
        Karyawan karyawan = new Karyawan();

        String inNama = Input.inputStringUser(sc, "Masukkan Nama: ");
        karyawan.setNama(inNama);
        int inUmur = (int) Input.inputAngkaUser(sc, "Masukkan Umur: ");
        karyawan.setUmur(inUmur);

        karyawan.keluarga.checkStatus(sc);

        // Pengalaman
        System.out.println("Pengalaman sebelumnya: ");
        System.out.println("1. Freelancer \n2. Magang \n3. Pekerja tetap \n4. Tidak ada");
        int inPengalaman;
        
        do {
            inPengalaman = (int) Input.inputAngkaUser(sc, "Input : ");
            
            if (inPengalaman > 4) {
                Start.Line("~", 50);
                System.out.println(" ".repeat(2) + "Invalid Input: Silakan Input angka 1 hingga 4" + " ".repeat(3));
                Start.Line("~", 50);
                Audio.playAudio("Tugas_LAB_PBO\\TP_7\\Audio\\Akh.wav");
            }
        } while (inPengalaman > 4);

        switch (inPengalaman) {
            case 1:
                Pengalaman.freelancer(karyawan);
                gajiSebelum(karyawan);
                break;
            case 2:
                Pengalaman.magang(karyawan);
                gajiSebelum(karyawan);
                break;
            case 3:
                Pengalaman.pekerjaTetap(karyawan);
                gajiSebelum(karyawan);
                break;
            case 4:
                Pengalaman.tidakada(karyawan);
                break;
        }
        
        // Pendidikan
        String inPendidikan = Input.inputPendidikanUser(sc, "Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3) : ").toUpperCase();
        karyawan.pendidikan.masaPendidikan(inPendidikan);

        // Projek
        System.out.println("Projek IT :");
        System.out.println("1. Minimal 4 \n2. Minimal 8 \n3. Minimal 12 \n4. Lebih dari 15");
        int inProjek;

        do {
            inProjek = (int) Input.inputAngkaUser(sc, "Input : ");
            
            if (inProjek > 4) {
                Start.Line("~", 50);
                System.out.println(" ".repeat(2) + "Invalid Input: Silakan Input angka 1 hingga 4" + " ".repeat(3));
                Start.Line("~", 50);
                Audio.playAudio("Tugas_LAB_PBO\\TP_7\\Audio\\Akh.wav");
            }
        } while (inProjek > 4);

        switch (inProjek) {
            case 1:
                karyawan.projek.setBanyakProjek(4);
                break;
            case 2:
                karyawan.projek.setBanyakProjek(8);
                break;
            case 3:
                karyawan.projek.setBanyakProjek(12);
                break;
            case 4:
                karyawan.projek.setBanyakProjek(15);
                break;
        }

        Start.Line("-", 50);
        System.out.print("Pangalaman sedang diproses");
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.print(".");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nPendidikan Terakhir : " + inPendidikan);
        System.out.println("Jumlah Projek IT : " + karyawan.projek.getBanyakProjek());

        checkKelulusan(karyawan);
    }

    // Method menjalankan opsi Tampilkan Data Karyawan
    private static void runTampilkanDetailKaryawan() {
        Start.Line("-", 50);
        System.out.println(" ".repeat(17) + "Detail Karyawan" + " ".repeat(18));
        Start.Line("-", 50);
        if (daftarKaryawan.isEmpty()) {
            Start.Line("~", 50);
            System.out.println(" ".repeat(8) + "Belum ada karyawan yang diundang" + " ".repeat(8));
            Start.Line("~", 50);
            Audio.playAudio("Tugas_LAB_PBO\\TP_7\\Audio\\Akh.wav");
        } else {
            for (Karyawan karyawan : daftarKaryawan) {
                karyawan.displayInfo();
                System.out.println();
            }
            Start.Line("-", 50);
            Audio.playAudio("Tugas_LAB_PBO\\TP_7\\Audio\\ohmygah.wav");
        }
    }

    // Method Main (Run Terminal)
    public static void main(String[] args) {
        Audio.playAudio("Tugas_LAB_PBO\\TP_7\\Audio\\Tuturu.wav");
        while (true) {
            Start.clear();
            tampilkanMenu();
            String inOpsi = Input.inputStringUser(sc, "Pilih opsi (a-d): ").toLowerCase();

            switch (inOpsi) {
                case "a":
                    Start.clear();
                    runTambahDataKaryawan();
                    break;
                case "b":
                    Start.clear();
                    runTampilkanDetailKaryawan();
                    break;
                case "c":
                    Audio.playAudio("Tugas_LAB_PBO\\TP_7\\Audio\\hehebuoi.wav");
                    Diagram.TampilkanMenu();
                    break;
                case "d":
                    Start.Line("=", 50);
                    System.out.println(" Terima Kasih Telah Menggunakan Aplikasi Karyawan");
                    Start.Line("=", 50);
                    Audio.playAudio("Tugas_LAB_PBO\\TP_7\\Audio\\Sayonara.wav");
                    System.exit(0);
                default:
                    Start.Line("=", 50);
                    Start.Line("~", 50);
                    System.out.println(" ".repeat(18) + "Invalid input" + " ".repeat(19));
                    Start.Line("~", 50);
                    Audio.playAudio("Tugas_LAB_PBO\\TP_7\\Audio\\Akh.wav");
                    break;
            }
        }
    }
}
