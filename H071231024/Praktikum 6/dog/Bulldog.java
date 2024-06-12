package TugasPraktikum6.dog;

public class Bulldog extends Dog {
    String name;

    public Bulldog(String name, int position, int averageLength) {
        super(position, averageLength);
        this.name = name;
    }


    @Override
    public void move() {
        position += 1;
        System.out.println("The "+ this.name + " moves to the right by  " + this.position);
    }

    @Override
    public void describe() {
        System.out.println("Name           : " + this.name);
        System.out.println("Average length : " + this.averageLength + " feet");
        System.out.println("Position       : " + this.position);
        System.out.println("Known for their wrinkled faces, short legs, and muscular builds.");
    }
}
