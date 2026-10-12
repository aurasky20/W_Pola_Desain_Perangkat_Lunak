public class ConcreateMediator implements IMediator {
    private Component1 component1;
    private Component2 component2;

    public ConcreateMediator(Component1 component1, Component2 component2) {
        this.component1 = component1;
        this.component2 = component2;
        this.component1.setMediator(this);
        this.component2.setMediator(this);
    }

    public void notify(Object sender, String ev){
        if (ev == "A"){
            System.out.println("Operasi A bereaksi...");
            this.component1.OperasiB();
        } else if(ev == "C"){
            System.out.println("Operasi C bereaksi...");
        }
    }
}
