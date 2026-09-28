public class VideoConverter {
    private static Codec codec;
    private static Audio audio;
    private static FileVideo file;
    public String convertVideo(String filename, String format){
        //Membuat Codec
        codec.createCodec();

        //Mengubah Audio
        audio.createAudio();

        //Mengubah namafile dan format
        String hasil = file.changeVideo(filename, format);

        System.out.println("Proses konversi selesai....");
        return hasil;
    }
}
