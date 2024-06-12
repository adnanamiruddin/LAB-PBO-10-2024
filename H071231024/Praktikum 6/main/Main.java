package TugasPraktikum6.main;

import TugasPraktikum6.deviceandcar.Car;
import TugasPraktikum6.deviceandcar.Smartphone;
import TugasPraktikum6.dog.Bulldog;
import TugasPraktikum6.dog.GermanShepherd;
import TugasPraktikum6.dog.Pitbull;
import TugasPraktikum6.dog.SiberianHusky;

public class Main {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull("Pitbull Dog", 0, 2);
        SiberianHusky husky = new SiberianHusky("Siberian Husky", 0, 2);
        Bulldog bulldog = new Bulldog("Bulldog", 0, 2);
        GermanShepherd shepherd = new GermanShepherd("German Shepherd", 0, 2);   

        line();
        pitbull.describe();
        line();
        pitbull.move();
        line();
        pitbull.describe();
        line();
        
        husky.describe();
        line();
        husky.move();
        line();
        husky.describe();
        line();
        
        bulldog.describe();
        line();
        bulldog.move();
        line();
        bulldog.describe();
        line();
        
        shepherd.describe();
        line();
        shepherd.move();
        line();
        shepherd.describe();
        line();

        Smartphone smartphone = new Smartphone(5000000, "Sumsang");
        line();
        smartphone.displayInfo();
        line();
        smartphone.move();
        line();

        Car car = new Car(100000000, "Toyota Supra MK4", 6, "Black", 350);
        line();
        car.displayInfo();
        line();
        car.move();
        line();
    }

    public static void line() {
        System.out.println("================================================================================");
    }   

}