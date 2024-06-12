package TugasPraktikum5.Tugas5No2;

class Product {
    protected String brand;
    protected String seriesNumber;
    protected int price;

    public Product(String brand, String seriesNumber, int price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Merk Brand            : " + this.brand);
        System.out.println("Nomor Seri            : " + this.seriesNumber);
        System.out.println("Harga                 : " + this.price);
    }
}

