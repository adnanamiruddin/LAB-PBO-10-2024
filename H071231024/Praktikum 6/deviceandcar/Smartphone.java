package TugasPraktikum6.deviceandcar;

public class Smartphone extends DeviceAndCar {
    
    public Smartphone(int price, String brand) {
        super(price, brand);
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah !!!");
    }
    
    @Override
    public void displayInfo() {
        System.out.println(">>>> SMARTPHONE INFO <<<<");
        System.out.println("Brand             : " + this.brand);
        System.out.println("Price             : " + "$" + this.price);
    }
}
