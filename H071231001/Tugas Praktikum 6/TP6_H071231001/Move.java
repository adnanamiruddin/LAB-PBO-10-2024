package TP6_H071231001;

interface Move {
    void move();
}

class Smartphone implements Move{   ///mengimplementasikan
    int price;
    String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public void move() {
        System.out.println("Smartphone berpindah");
    }
}

class Car implements Move{
    int totalForwardGear;
    String color;
    int maxSpeed;
    
    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}

