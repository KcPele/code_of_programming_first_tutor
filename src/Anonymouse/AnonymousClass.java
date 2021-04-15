package Anonymouse;

class Ant{
    public void work(){
        System.out.println("they are hard working");
    }
}
interface Elephant {
    public void grow();
}


public class AnonymousClass {
    public static void main(String[] args) {
        Ant ant1  = new Ant(){
            @Override public void work(){
                System.out.println("very hard working");
            }
        };
        ant1.work();
       Elephant elephant = new Elephant() {
           @Override
           public void grow() {
               System.out.println("the are very huge");
           }
       };
       elephant.grow();

    }
}
