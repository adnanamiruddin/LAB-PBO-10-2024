package TugasPraktikum5.Tugas5No2;
import java.util.ArrayList;


class TokoElektronik {
    private ArrayList<Product> stokProduk = new ArrayList<>();

    public void tambahProduk(Product produk) {
        stokProduk.add(produk);
    }

    public void tampilkanSemuaProduk() {
        for (Product produk : stokProduk) {
            produk.displayInfo();
            System.out.println();
        }
    }

    public void beliProduk(String seriesNumber) {
        boolean temukan = false;
        for (Product produk : stokProduk) {
            if (produk.seriesNumber.equals(seriesNumber)) {
                line2();
                System.out.println("Produk Ditemukan !!!");
                line2();
                produk.displayInfo();
                line2();
                System.out.println("Pembelian berhasil !!!");
                line2();
                temukan = true;
                stokProduk.remove(produk);
                break;
            }
        }
        if (!temukan) {
            System.out.println("Produk Tidak Ditemukan !!!");
        }
    }

    public void line1() {
        System.out.println("---------------------------------------------");
    }
    public void line2() {
        System.out.println("=============================================");
    }
}   
