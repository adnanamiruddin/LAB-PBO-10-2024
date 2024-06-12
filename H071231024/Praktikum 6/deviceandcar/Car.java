package TugasPraktikum6.deviceandcar;

public class Car extends DeviceAndCar {
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car(int price, String brand, int totalForwardGear, String color, int maxSpeed) {
        super(price, brand);
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi !!!");
    }

    @Override
    public void displayInfo() {
        System.out.println(">>>> CAR INFO <<<<");
        System.out.println("Brand               : " + this.brand);
        System.out.println("Price               : " + "$" + this.price );
        System.out.println("Color               : " + this.color);
        System.out.println("Total Forward Gears : " + this.totalForwardGear);
        System.out.println("Max Speed           : " + this.maxSpeed + " Km/h");
    }
}