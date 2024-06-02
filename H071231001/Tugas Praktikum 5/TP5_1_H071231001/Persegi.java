package TP5_1_H071231001;

class Persegi extends BangunDatar {
        private double sisi;
    
        public Persegi(double sisi) {
            this.sisi = sisi;
        }
    
        @Override //override ke kelas induk bangun datar
        public double hitungLuas() {
            return Math.pow(sisi, 2);
        }
    
        @Override
        public double hitungKeliling() {
            return 4 * sisi;
        }
    }