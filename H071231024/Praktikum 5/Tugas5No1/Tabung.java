package TugasPraktikum5.Tugas5No1;

class Tabung extends BangunRuang {  // TABUNG
    private double jariJari;
    private double tinggi;

    Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
}