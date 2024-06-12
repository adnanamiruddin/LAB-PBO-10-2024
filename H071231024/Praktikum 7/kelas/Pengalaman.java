package TugasPraktikum7.kelas;

public class Pengalaman extends Kehidupan{
    String jenisPekerjaan;
  
    public Pengalaman(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    @Override
    public void prosesKehidupan(){
        System.out.println("Memproses Pengalaman...");
    }

    public void pengalamanKaryawan(String jenisPekerjaan, int pengalaman) {
        System.out.println("Pernah " + jenisPekerjaan);
    }
    
}
