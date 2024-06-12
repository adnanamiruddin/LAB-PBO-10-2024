package TugasPraktikum5.Tugas5No1;

class PersegiPanjang extends BangunDatar {      // PERSEGI PANJANG
    private double panjang;
    private double lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}