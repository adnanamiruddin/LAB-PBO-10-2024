package TugasPraktikum5.Tugas5No1;

class Lingkaran extends BangunDatar {       // LINGKARAN
    private double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double hitungLuas() {
        return Math.PI * Math.pow(jariJari, 2);
    }

    @Override
    double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}
