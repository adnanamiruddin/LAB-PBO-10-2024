class Cuboid {
    double height, widht, lenght;

    double getVolume() {
        //Lengkapi
        double volume = lenght * widht * height;
        return volume;
    }
}

public class Tugas2No3 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();

        //Lengkapi
        cuboid.height = 10;
        cuboid.widht = 15;
        cuboid.lenght = 30;

        System.out.println(String.format("Volume = %.2f", cuboid.getVolume()));
    }
}
