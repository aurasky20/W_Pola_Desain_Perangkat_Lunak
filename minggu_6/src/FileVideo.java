public class FileVideo {
    public static String changeVideo(String filename, String format){

        String[] str = filename.split("\\.");
        String hasil = str[0] + "." + format;   
        
        System.out.println("Mengonversi Format Video .... ");
        return hasil;
    }
}
