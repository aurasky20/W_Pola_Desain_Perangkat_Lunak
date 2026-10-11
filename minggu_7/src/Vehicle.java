public abstract class Vehicle {
    private int x;

    public void move() {
        System.out.println("Kendaraan bergerak...");
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    abstract public void makeSound();
}
