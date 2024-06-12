package TugasPraktikum5.Tugas5No1;

class Balok extends BangunRuang {   // BALOK
    private double panjang;
    private double lebar;
    private double tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    double hitungLuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}