public class Main {
    private static Dialog dialog;
    public static void main(String args[]) {
        setting();
        ordering();
    }

    public static void setting() {
        int i = 1; // 1 buat windows, 2 buat web
        if (i == 1) {
            dialog = new WindowsDialog();
        } else {
            dialog = new WebDialog();
        } 
    }

    static void ordering() {
        dialog.render();
    }
}