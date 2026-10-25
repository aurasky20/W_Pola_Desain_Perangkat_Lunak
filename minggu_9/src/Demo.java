public class Demo {
    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.event.subscribe("Open", new LoggingListener("D:\\mencoba.txt"));
        editor.event.subscribe("Open", new LoggingListener("D:\\Latihan.txt"));
        editor.event.subscribe("Save", new EmailAlertListener("aura@gmail.com"));

        try {
            editor.openFile("test.txt");
            // editor.saveFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
