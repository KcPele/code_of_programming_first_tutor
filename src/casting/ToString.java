package casting;

class Frog{
    private  int id;
    public String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public  String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
    }
}


public class ToString {
    public static void main(String[] args) {
        Frog frog1 = new Frog(3, "Fred");
        System.out.println(frog1);
    }

}
