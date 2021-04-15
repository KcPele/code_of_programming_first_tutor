package casting;

class Engine{
    public void start(){
        System.out.println("casting.Engine is on");
    }
}
class Fuel extends Engine{
    public void start(){
        System.out.println("casting.Fuel refilling");
    }
    public void empty(){
        System.out.println("engine is empty");
    }
}

public class UpAndDown {
    public static void main(String[] args) {
        Engine endine1 = new Engine();
        Fuel fuel1 = new Fuel();

        endine1.start();
        fuel1.start();
        fuel1.empty();

        //Upcasting
        Engine engine2 = fuel1;
        engine2.start();

        //DownCasting
        Engine engine3 = fuel1;
        Fuel fuel2 = (Fuel) engine3;
        fuel2.start();
        fuel2.empty();

    }
}
