package Tugas_LAB_PBO.TP_7.Task;

public class Karyawan {
    String nama, jabatan;
    int umur;
    double gaji;

    public Pendidikan pendidikan = new Pendidikan();
    public Pengalaman pengalaman = new Pengalaman();
    public Projek projek = new Projek();
    public Keluarga keluarga = new Keluarga();
    
    public Karyawan() {}

    public Karyawan(String nama, String jabatan, int umur, double gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.umur = umur;
        this.gaji = gaji;
    }
    
    public void displayInfo() {
        System.out.println("Nama    \t: " + this.getNama());
        System.out.println("Umur    \t: " + this.getUmur());
        System.out.println("Jabatan \t: " + "Karyawan");
        System.out.println("Gaji    \t: " + this.getGaji());
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
}
