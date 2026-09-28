public class Client {
    public static void main(String[] args){
        String video = "FacadeMethod.mp4";
        String format = "ogg";

        VideoConverter converter = new VideoConverter();
        String hasil = converter.convertVideo(video, format);

        System.out.println("Hasil konversi video: " + hasil);
    }
}
