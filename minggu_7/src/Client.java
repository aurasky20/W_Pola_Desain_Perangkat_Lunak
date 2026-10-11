public class Client {
    public static void main(String[] args) {

        Vehicle vehicle;

        int pilihan = 3; // 1 untuk mobil, 2 untuk kapal

        switch (pilihan) {
            case 1:
                vehicle = new Car();
                break;
            case 2:
                vehicle = new Ship();
                break;
            case 3:
                vehicle = new Plane();
                break;
            default:
                throw new IllegalArgumentException("Pilihan tidak valid");
        }

        vehicle.makeSound();
    }
}
