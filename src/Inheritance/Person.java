package Inheritance;

public class Person implements Info {
    private String name ;

    public Person(String name){
        this.name = name;

    }
    public  void greet(){
        System.out.println("Greeting from the Persn class");
    }

    @Override
    public void showInfo() {
        System.out.println("Inheritance.Person name is " + name);
    }
}
