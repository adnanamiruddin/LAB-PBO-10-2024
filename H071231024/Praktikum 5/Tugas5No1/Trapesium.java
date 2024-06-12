package TugasPraktikum5.Tugas5No1;

class Trapesium extends BangunDatar {       // TRAPESIUM
    private double sisi1;
    private double sisi2;
    private double sisi3;
    private double sisi4;
    private double tinggi;

    Trapesium(double sisi1, double sisi2, double sisi3, double sisi4, double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.sisi4 = sisi4;
        this.tinggi = tinggi;
    }

    @Override
    double hitungLuas() {
        return 0.5 * (sisi1 + sisi2) * tinggi;
    }

    @Override
    double hitungKeliling() {
        return sisi1 + sisi2 + sisi3 + sisi4;
    }
}