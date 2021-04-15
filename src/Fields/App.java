package Fields;

class Thing {
    public final static int LUCKY = 7;
    public String name;
    public static  String description;
    public static int count = 0;
    public int id;
    public  Thing() {
        id = count;
        count++;
    }
    public void showName(){
        System.out.println("Object id " + id + ": " +description + "; " + name);
    }
    public static void show(){
        System.out.println(description);
    }
}

public class App {
    public static void main(String[] args) {
        Thing.description = "i have a thing";
        System.out.println(Thing.description);
        System.out.println("Before creating object count is: " + Thing.count);
       Thing thing1 = new Thing();
       Thing thing2 = new Thing();
       thing1.name = "you";
       thing2.name = "joan";
       Thing.show();
        System.out.println("after creating object count is: " + Thing.count);
        //System.out.println(thing1.name);
        //System.out.println(thing2.name);

        thing1.showName();
        thing2.showName();
        System.out.println(Thing.LUCKY);
    }
}