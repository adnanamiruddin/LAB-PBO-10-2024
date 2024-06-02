package TP5_1_H071231001;

class Kubus extends BangunRuang {
    private double sisi;
    
    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }
}
