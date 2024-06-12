package TugasPraktikum7.kelas;

public class Pendidikan extends Kehidupan{
    String tingkatPendidikan;

    public Pendidikan(String tingkatPendidikan) {
        this.tingkatPendidikan = tingkatPendidikan;
    }
    
    @Override
    public void prosesKehidupan() {
        System.out.println("Memproses Status Pendidikan...");   
    }

    public void pendidikanKaryawan() {
        System.out.println("Pendidikan Terakhir : " + getTingkatPendidikan());
    }

    public String getTingkatPendidikan() {
        return tingkatPendidikan;
    }

    

    

    




}
