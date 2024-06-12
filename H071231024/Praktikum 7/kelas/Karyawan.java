package TugasPraktikum7.kelas;

public class Karyawan {
    String name;
    int umur;
    String jabatan;
    double gaji;

    public Karyawan(String name, int umur, String jabatan, double gaji) {
        this.name = name;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public void pengalamanKerja(Pengalaman pengalaman){
    }

    public void display(){
        System.out.println("===========================================================================");
        System.out.println("Detail Karyawan");
        System.out.println("===========================================================================");
        System.out.println("Nama\t: " + getName());
        System.out.println("Jabatan : " + getJabatan());
        System.out.println("Umur\t: " + getUmur());
        System.out.println("Gaji\t: " + getGaji());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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