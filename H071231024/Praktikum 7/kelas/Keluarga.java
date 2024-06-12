package TugasPraktikum7.kelas;

public class Keluarga extends Kehidupan {
    String statusKeluarga;

    public Keluarga(String statusKeluarga) {
        this.statusKeluarga = statusKeluarga;
    }

    @Override
    public void prosesKehidupan() {
        System.out.println("Memproses Status Keluarga...");
    }
    public void status(){
        System.out.println("Status : " + getStatusKeluarga());
    }

    public String getStatusKeluarga() {
        return statusKeluarga;
    }

    


    
}