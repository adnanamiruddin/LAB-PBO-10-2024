package TugasPraktikum5.Tugas5No2;

class Smartphone extends Product {
    private int screenSize;
    private String storageCapacity;

    public Smartphone(String brand, String seriesNumber, int price, int screenSize, String storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ukuran Layar          : " + this.screenSize + " inci");
        System.out.println("Kapasitas Penyimpanan : " + this.storageCapacity);
    }
}
