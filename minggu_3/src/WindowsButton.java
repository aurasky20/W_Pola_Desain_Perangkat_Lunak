public class WindowsButton implements Button{
    public void render() {
        System.out.println("Buat Windows Button");
        onClick();
    }

    public void onClick() {
        System.out.println("Muncul tulisan Windows");
    }
}
