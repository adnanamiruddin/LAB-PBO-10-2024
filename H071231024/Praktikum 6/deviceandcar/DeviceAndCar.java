package TugasPraktikum6.deviceandcar;

interface IMoves {
    public void move();
}

public abstract class DeviceAndCar implements IMoves {
    int price;
    String brand;

    public DeviceAndCar(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    abstract void displayInfo();
}
