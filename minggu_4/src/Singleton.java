public class Singleton {
    private static Singleton instance;
    public String value;


    private Singleton(String value) {
        // Private constructor to prevent instantiation
        this.value = value;
    }

    public static Singleton getInstance(String Value){
        if (instance == null) {
            instance = new Singleton(Value);
        }
        return instance;
    }
}
