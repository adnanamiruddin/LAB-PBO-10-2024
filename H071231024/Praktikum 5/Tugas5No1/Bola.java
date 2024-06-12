package TugasPraktikum5.Tugas5No1;

class Bola extends BangunRuang {    // BOLA
    private double jariJari;

    Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    @Override
    double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }
}

