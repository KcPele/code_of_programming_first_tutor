package AbstractClass;


public class Camera extends Machine {
    @Override
    public void start() {
        System.out.println("taking pictures");
    }

    @Override
    public void doStuff() {
        System.out.println("camera is taking pictures");
    }

    @Override
    public void shutdown() {
        System.out.println("camera not in use");
    }
}
