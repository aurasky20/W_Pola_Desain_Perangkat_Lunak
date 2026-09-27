public class Adapter implements FileXML {
    private FileJSON adaptee;
    
    @Override 
    public String metode(String data){
        String specialData = data;
        return adaptee.metode(specialData);
    }
}
