package TugasPraktikum6.dog;

public class Pitbull extends Dog {
    String name;

    public Pitbull(String name, int position, int averageLength) {
        super(position, averageLength);
        this.name = name;
    }


    @Override
    public void move() {
        this.position += 3;
        System.out.println("The "+ this.name + " moves to the right by  " + this.position);
    }

    @Override
    public void describe() {
        System.out.println("Name           : " + this.name);
        System.out.println("Average length : " + this.averageLength + " feet");
        System.out.println("Position       : " + this.position);
        System.out.println("Known for their muscular build, strong jaws, and short coats.");
    }
}