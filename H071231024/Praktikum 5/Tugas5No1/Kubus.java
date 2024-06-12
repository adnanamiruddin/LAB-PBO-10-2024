package TugasPraktikum5.Tugas5No1;

class Kubus extends BangunRuang {   // KUBUS
    private double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    @Override
    double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
}

