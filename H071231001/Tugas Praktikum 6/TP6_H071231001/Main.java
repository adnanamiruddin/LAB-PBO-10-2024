package TP6_H071231001;

public class Main {
  public static void main(String[] args) {
    Smartphone smartphone = new Smartphone(50000, "Samsung");
    Car car = new Car(100, "Putih", 250);
    Pitbull pitbull = new Pitbull(3, 50);

    pitbull.move();
    pitbull.describe();
    System.out.println("-------------------------------------------------");
    car.move();
    System.out.println("-------------------------------------------------");
    smartphone.move();

  }  
}
