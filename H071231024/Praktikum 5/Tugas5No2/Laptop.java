package TugasPraktikum5.Tugas5No2;

class Laptop extends Product {
    int ramSize;
    String processorType;

    public Laptop(String brand, String seriesNumber, int price, int ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas RAM         : " + this.ramSize);
        System.out.println("Tipe Prossessor       : " + this.processorType);
    }
}


