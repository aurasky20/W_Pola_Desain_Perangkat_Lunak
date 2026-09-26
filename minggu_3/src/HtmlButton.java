public class HtmlButton implements Button{
    public void render() {
        System.out.println("Buat HTML Button");
        onClick();
    }

    public void onClick() {
        System.out.println("Muncul tulisan HTML");
    }
}
