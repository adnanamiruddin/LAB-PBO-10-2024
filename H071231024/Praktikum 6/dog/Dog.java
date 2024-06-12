package TugasPraktikum6.dog;

interface IDogDesc {
    public void describe();
}

public abstract class Dog implements IDogDesc {
    int position;
    int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    abstract void move();
}
