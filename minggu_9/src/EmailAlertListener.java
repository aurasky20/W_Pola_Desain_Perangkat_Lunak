import java.io.File;

public class EmailAlertListener implements EventListener{
    private String email;

    public EmailAlertListener(String email){
        this.email = email;
    }

    @Override 
    public void update(String eventType, File file){
        System.out.println("Email kepada " + this.email + ". "
            + "Seseorang telah melakukan operasi " + eventType + " pada file: " + file.getName());

    }
}
