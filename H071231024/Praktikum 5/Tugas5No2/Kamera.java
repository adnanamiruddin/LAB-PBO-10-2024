package TugasPraktikum5.Tugas5No2;

class Kamera extends Product {
    int resolution;
    String lensType;

    public Kamera(String brand, String seriesNumber, int price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Resolusi Kamera       : " + this.resolution);
        System.out.println("Tipe Lensa            : " + this.lensType);
    }
}
