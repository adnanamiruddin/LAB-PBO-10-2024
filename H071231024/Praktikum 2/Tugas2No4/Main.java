package TugasPraktikum2.Tugas2No4;

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;
 
    String getName() {
        return nama;
    }
 
    String getNIM() {
        return nim;
    }

    String getAlamat() {
        return alamat.getAlamat();
    }


}

class Alamat {
    String jalan;
    String kota;

    String getAlamat() {
        return jalan + ", " + kota;
    }

}

public class Main {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Ilham Kurniawan";
        mahasiswa.nim = "H071231024";

        System.out.println("=======================================");
        System.out.println("Nama   : " + mahasiswa.getName());
        System.out.println("NIM    : " + mahasiswa.getNIM());
        System.out.println("Alamat : " + mahasiswa.getAlamat());
        System.out.println("=======================================");
    }
    
}
