package AbstractClass;

public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("starting car");
    }

    @Override
    public void doStuff() {
        System.out.println("the car is round the round about");
    }

    @Override
    public void shutdown() {
        System.out.println("the car is about to be packed");
    }
}
