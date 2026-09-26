public class Client {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("Makanan");
        Singleton singleton2 = Singleton.getInstance("Minuman");
        System.out.println(singleton1.value); // Output: Makanan
        System.out.println(singleton2.value); // Output: Minuman
    }
}
