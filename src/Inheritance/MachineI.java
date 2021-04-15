package Inheritance;

public class MachineI implements Info {
    private int id =7;
    public  void start (){
        System.out.println("Inheritance.Machine started");
    }

    @Override
    public void showInfo() {
        System.out.println("Inheritance.Machine id is" );
    }
}
