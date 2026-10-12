public class Client {
    public static void main(String[] args) {

        Component1 component1 = new Component1();
        Component2 component2 = new Component2();

        new ConcreateMediator(component1, component2);

        component1.OperasiA();
        component2.OperasiD();
    }   
}
