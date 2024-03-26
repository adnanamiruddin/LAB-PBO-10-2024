package Java.H071231050;

import java.util.Scanner;

public class TP1_3_H071231050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String date = input.nextLine();
        input.close();
        ubahTanggal(date);

    }

    public static void ubahTanggal(String data) {
        // String[] tampung = Date.split("-");
        String tanggal = data.substring(0, 2);
        String bulan = data.substring(3, 5);
        String tahun = data.substring(6, 8);
        int tahun1 = Integer.parseInt(tahun);

        StringBuilder hasil = new StringBuilder();

        if (tanggal.charAt(0) != '0') {
            hasil.append(tanggal);
        } else {
            hasil.append(tanggal.charAt(1));
        }

        switch (bulan) {
            case "01":
                hasil.append(" Januari");
                break;
            // hasil.append(" Januari");
            // break;
            case "02":
                hasil.append(" Februari");
                break;
            case "03":
                hasil.append(" Maret");
                break;
            case "04":
                hasil.append(" April");
                break;
            case "05":
                hasil.append(" Mei");
                break;
            case "06":
                hasil.append(" Juni");
                break;
            case "07":
                hasil.append(" Juli");
                break;
            case "08":
                hasil.append(" Agustus");
                break;
            case "09":
                hasil.append(" September");
                break;
            case "10":
                hasil.append(" OKtober");
                break;
            case "11":
                hasil.append(" November");
                break;
            case "12":
                hasil.append(" Desember");
                break;
            default:
                break;
        }

        if (tahun1 <= 24) {
            hasil.append(" 20" + tahun);
        } else {
            hasil.append(" 19" + tahun);
        }
        System.out.println(hasil.toString());

    }
}