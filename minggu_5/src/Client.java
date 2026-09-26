

public class Client {
    private static FileXML adaptee;
    public static void main(String[] args){
        String data = "ini file XML";
        System.out.println(data);

        System.out.println("Dikonversi menjadi : ");

        adaptee = new Adapter();
        String hasil = adaptee.metode(data);
        System.out.println(hasil);
    }
}
