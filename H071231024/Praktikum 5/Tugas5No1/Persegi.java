package TugasPraktikum5.Tugas5No1;

class Persegi extends BangunDatar {     // PERSEGI
    private double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return Math.pow(sisi, 2);
    }

    @Override
    double hitungKeliling() {
        return 4 * sisi;
    }
}
