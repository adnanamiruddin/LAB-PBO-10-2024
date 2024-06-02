package live_coding;

class Handphone {
    private String merk;
    private String model;
    private double harga;
    private int tahunProduksi;
    private String deskripsi;

    public Handphone(String merk, String model, double harga, int tahunProduksi, String deskripsi) {
        this.merk = merk;
        this.model = model;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
        this.deskripsi = deskripsi;

    }

    public Handphone() {

    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Deskripsi: " + deskripsi);

    }

}

public class TP {

    public static void main(String[] args) {
        Handphone handphone1 = new Handphone();

        handphone1.setMerk("samsung");
        handphone1.setModel("flip");
        handphone1.setHarga(5000000);
        handphone1.setTahunProduksi(2019);
        handphone1.setDeskripsi("handphone");

        handphone1.displayInfo();

        Handphone handphone2 = new Handphone("oppo", "J2Prime", 20000, 2020, "dreamHandphone");
        System.out.println(handphone2.getMerk());
        System.out.println(handphone2.getModel());
        System.out.println(handphone2.getHarga());
        System.out.println(handphone2.getTahunProduksi());
        System.out.println(handphone2.getDeskripsi());

        SelfUtils.displaySelfData();

    }
}

class SelfUtils {
    public static void displaySelfData() {
        System.out.println("Nama : Zaenab Putri Az Zakiyyah");
        System.out.println("Nim : H071231001");

    }
}