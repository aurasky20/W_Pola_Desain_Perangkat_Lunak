import java.io.File;

public class Editor {
    public EventManager event;
    private File file;

    public Editor() {
        this.event = new EventManager("Open", "Save");
    }

    public void openFile(String file) {
        this.file = new File(file);
        this.event.notify("Open", this.file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            this.event.notify("Save", this.file);
        } else {
            throw new Exception("Buka File terlebih dahulu");
        }

    }
}
